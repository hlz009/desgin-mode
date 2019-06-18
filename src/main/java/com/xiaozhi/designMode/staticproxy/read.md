#此项目演示静态代理模式
代理模式为某个对象提供一个代理，以控制对这个对象的访问。代理类和委托类有共同的父类或父接口，这样在任何使用委托类对象的地方都可以用代理对象替代。代理类负责请求的预处理、过滤、将请求分派给委托类处理、以及委托类执行完请求后的后续处理。

静态代理，由用户创建或工具生成代理类的源码，再编译代理类。所谓静态也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。

静态代理类优缺点
优点：业务类只需要关注业务逻辑本身，保证了业务类的重用性。这是代理的共有优点。

缺点：
1）代理对象的一个接口只服务于一种类型的对象，如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。

2）如果接口增加一个方法，除了所有实现类需要实现这个方法外，所有代理类也需要实现此方法。增加了代码维护的复杂度。如在给Leader接口增加了一个reject()方法，那么真实类当然要实现，但是静态代理类也必须实现。另外，如果要按照上述的方法使用代理模式，那么真实角色(委托类)必须是事先已经存在的，并将其作为代理对象的内部属性。