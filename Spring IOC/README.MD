# 此项目为学习Spring AOP的简单应用
简单说明一下
src
	dao
		-AccountDao  			账户接口
		Impl
			-AccountDaoImpl		账户实现类
	service
		- AccountServiceImpl	实现构造方法注入
		- AccountServiceImpl2	实现set方法注入
		- AccountServiceImpl3	实现复杂/集合类型注入
	main
		- Client				程序入口
resources
	- springIoc.xml xml			配置文件

分别实现了
	构造方法注入
	```xml

    <bean id="accountService" class="com.zonkidd.service.impl.AccountServiceImpl">
    <constructor-arg name="name" value="zonkidd"> </constructor-arg>
    <constructor-arg name="age" value="18"> </constructor-arg>
    <constructor-arg name="birthday" ref="now"> </constructor-arg>
    </bean>
    <bean id="now" class="java.util.Date"></bean>
	```
	set方法注入
	```xml
    <bean id="accountService2" class="com.zonkidd.service.impl.AccountServiceImpl2">
        <property name="name" value="zonkidd2"></property>
        <property name="age" value="18"></property>
        <property name="birthday" ref="now"></property>
        <property name="accountDao" ref="accountDao"></property>
    </bean>
    <bean id="now" class="java.util.Date"></bean>
    <bean id="accountDao" class="com.zonkidd.dao.impl.AccountDaoImpl"></bean>
	```
	复杂/集合类型注入
	```xml
	    <bean id="accountService3" class="com.zonkidd.service.impl.AccountServiceImpl3">
        <property name="myStrs">
            <array>
                <value>AAA</value>
                <value>BBB</value>
                <value>CCC</value>
            </array>
        </property>
        <property name="myList">
            <list>
                <value>AAA</value>
                <value>BBB</value>
                <value>CCC</value>
            </list>
        </property>
        <property name="mySet">
            <set>
                <value>AAA</value>
                <value>BBB</value>
                <value>CCC</value>
            </set>
        </property>
        <property name="myMap">
            <map>
                <entry key="testA" value="AAA"></entry>
                <entry key="testB" value="BBB"></entry>
                <entry key="testC" value="CCC"></entry>
            </map>
        </property>
        <property name="myProps">
            <props>
                <prop key="testA">CCC</prop>
            </props>
        </property>
    </bean>
	```
### 作者
zonkidd