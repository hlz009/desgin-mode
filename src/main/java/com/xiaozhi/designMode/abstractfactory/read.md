#此项目演示抽象工厂模式
抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
比如：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。我们可以在一个产品族里面，定义多个产品。

适合产品族不稳定，产品等级稳定的情况

优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

实际使用中，都需要根据业务去权衡使用工厂方法还是抽象工厂，前者关注点在产品等级上，后者关注点在产品族上，对于稳定的产品族，也即是产品等级数量稳定，使用抽象工厂会更加有效率，毕竟不再是一个工厂生产一种产品，而是一个工厂生产多种同族产品，对于不稳定的产品族，单独使用工厂方法会显得更加灵活