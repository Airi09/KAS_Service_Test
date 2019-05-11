# KAS_Service_Test
KAS Services Test

Please find attachments for whole source code of both programs.

Both program runnable jar file also shared. Both working as expected.

According to my finding & learning i understood the concept of wait(),notify() etc methods to be in object class but not in Thread class.

Qusetion. Why wait(), notify(),notifyall() are object class methods but not thread class?
Answer:
1. These methods works on the locks and locks are associated with Object and not Threads. Hence, it is in Object class.
2. They are responsible for communication between mutiple Threads.
3. Locks are made available on per Object basis. Threads needs lock and they wait for lock, they don't know which threads holds lock instead they just know the lock is hold by some thread and they should wait for lock instead of knowing which thread is inside the synchronized block and asking them to release lock.

I will look forward to hear back from your side.

Thanks & Regards,
Abhinav Airi
