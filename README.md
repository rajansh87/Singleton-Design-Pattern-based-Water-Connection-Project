# Singleton-Design-Pattern-based-Water-Connection-Project         
## An application of Singleton Design Pattern in Java.       
---------------------------------------------------------------------------------------------------------------------------------------
### Defination

####Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it". 
####In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

![](https://i.ytimg.com/vi/QsBQnFUx388/maxresdefault.jpg)

###There are two forms of singleton design pattern:
>  Early Instantiation: Creation of instance at load time.
>  Lazy Instantiation: creation of instance when required.

###Advantage of Singleton design pattern:
>  Saves memory because object is not created at each request. Only single instance is reused again and again.

###Usage of Singleton design pattern:
>   Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc. 

###How to create Singleton design pattern?
####To create the singleton class, we need to have static member of class, private constructor and static factory method.
  #### Static member: 
>It gets memory only once because of static, itcontains the instance of the Singleton class.

#### Private constructor:
>It will prevent to instantiate the Singleton class from outside the class. 

####Static factory method:
> This provides the global point of access to the Singleton object and returns the instance to the caller.


###How to Run?
####To run this project download the complete directory and extract the zipped file.
####Then follow following steps:
> 1. Open command prompt.
>2. Go to the loaction where you have stores the project using command
>>cd location          (  location of the Java Project folder )
>3. Compile both Tank.java and TankTest.java file.
>4. Run TankTest.java file.

###End
