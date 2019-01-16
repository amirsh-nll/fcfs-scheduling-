# fcfs-scheduling
First come, first served cpu scheduling in java

**About First come, first served : ([wikipedia](https://en.wikipedia.org/wiki/Scheduling_(computing)#First_come,_first_served))**

First in, first out (FIFO), also known as first come, first served (FCFS), is the simplest scheduling algorithm. FIFO simply queues processes in the order that they arrive in the ready queue. This is commonly used for a task queue, for example as illustrated in this section.
* Since context switches only occur upon process termination, and no reorganization of the process queue is required, scheduling overhead is minimal.
* Throughput can be low, because long processes can be holding CPU, waiting the short processes for a long time (known as convoy effect).
* No starvation, because each process gets chance to be executed after a definite time.
* Turnaround time, waiting time and response time depends on the order of their arrival and can be high for the same reasons above.
* No prioritization occurs, thus this system has trouble meeting process deadlines.
* The lack of prioritization means that as long as every process eventually completes, there is no starvation. In an environment where some processes might not complete, there can be starvation.
* It is based on queuing.

....

**this Repository Based : java programming language**
