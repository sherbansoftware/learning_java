package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Dynamic.Queue_.Circular_Queue;

// https://www.programiz.com/dsa/circular-queue


/*                                          Circular Queue Data Structure

    Circular queue avoids the wastage of space in a regular queue implementation using arrays.

    How Circular Queue Works

        Circular Queue works by the process of circular increment i.e. when we try to increment the pointer and we reach
        the end of the queue, we start from the beginning of the queue.

        Here, the circular increment is performed by modulo division with the queue size. That is,

            if REAR + 1 == 5 (overflow!), REAR = (REAR + 1)%5 = 0 (start of queue)

            1. Enqueue Operation ---------------------------------------------------------------------------------------

                • check if the queue is full
                • for the first element, set value of FRONT to 0
                • circularly increase the REAR index by 1 (i.e. if the rear reaches the end, next it would be at the
                     start of the queue)
                • add the new element in the position pointed to by REAR

           2. Dequeue Operation ----------------------------------------------------------------------------------------

               • check if the queue is empty
               • return the value pointed by FRONT
               • circularly increase the FRONT index by 1
               • for the last element, reset the values of FRONT and REAR to -1


*/