Multithreaded Job Scheduler

A console-based job execution engine in Java that runs tasks concurrently using a fixed thread pool, with priority scheduling, automatic retries, and live status tracking.

Overview

Instead of processing jobs one at a time, this scheduler runs multiple jobs in parallel — similar to how real-world systems like Celery, Sidekiq, and CI/CD runners handle background work at scale.

Each job carries a priority and a simulated duration. A thread-safe priority queue ensures high-priority jobs run before lower-priority ones. Every job moves through a clear lifecycle:

PENDING → RUNNING → DONE
                  → FAILED (retries if attempts remain)
Built With
Java — core language
java.util.concurrent — ExecutorService, PriorityBlockingQueue, ConcurrentHashMap, AtomicInteger

No external frameworks or dependencies — built entirely on the JDK standard library.

Project Status

In progress — building this as a hands-on study of safe concurrent system design.

Day	Milestone
1	Thread basics — manual thread creation and lifecycle
2+	ExecutorService, thread pools, priority queue, retries, status tracking
Author

Ritesh Singh
