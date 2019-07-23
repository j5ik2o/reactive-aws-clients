<#function filterTypeName name>
    <#return name?replace("SdkBytes", "software.amazon.awssdk.core.SdkBytes")?replace("Instant", "java.time.Instant")>
</#function>

<#function getGetterSimpleTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterTypeName(method.returnTypeDesc.simpleTypeName)>
        </#if>
    </#list>
    <#return filterTypeName(default)>
</#function>

<#function getGetterFullTypeName name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterTypeName(method.returnTypeDesc.fullTypeName)>
        </#if>
    </#list>
    <#return filterTypeName(default)>
</#function>

<#function getGetterKeyTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterTypeName(method.returnTypeDesc.keyTypeDesc.simpleTypeName)>
        </#if>
    </#list>
    <#return filterTypeName(default)>
</#function>

<#function getGetterValueTypeName methods name default>
    <#list methods as method>
        <#if method.name == name>
            <#return filterTypeName(method.returnTypeDesc.valueTypeDesc.simpleTypeName)>
        </#if>
    </#list>
    <#return filterTypeName(default)>
</#function>

<#function isDefined typeName>
    <#switch typeName>
        <#case "Unit">
            <#return true>
        <#case "Char">
            <#return true>
        <#case "Short">
            <#return true>
        <#case "Int">
            <#return true>
        <#case "Long">
            <#return true>
        <#case "Double">
            <#return true>
        <#case "Float">
            <#return true>
        <#case "Boolean">
            <#return true>
        <#case "String">
            <#return true>
        <#default >
            <#return false>
    </#switch>
</#function>


<#function escapeMethodName name>
    <#if name=="type">
        <#return "`type`" />
    </#if>
    <#return name />
</#function>



<#macro enrichSetterAsScala simpleTypeName method>
    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
    <#local methodName=escapeMethodName(method.name)/>
    <#local firstType=method.returnTypeDesc/>
    <#local typeName=filterTypeName(firstType.simpleTypeName)/>
    <#local fullTypeName=filterTypeName(firstType.fullTypeName)/>
    <#switch typeName>
        <#case "Seq">
            final def ${method.name}AsScala(value: Option[${fullTypeName}]): ${simpleTypeName}.Builder = {
            <#local valueTypeName=firstType.valueTypeDesc.simpleTypeName>
            <#if valueTypeName == "SdkBytes">
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if mapValueTypeName == "Seq">
                    value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.map(_.view.map{ case (k, v) => (k, v.asJava) }.asJava).asJava).toMap }
                <#else>
                    value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.map(_.asJava).asJava) } 
                </#if>
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.map(_.asJava).asJava) } 
            <#elseif valueTypeName == "String">
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            <#elseif valueTypeName == "Int">
                value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Integer])).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.${valueTypeName}])).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            <#else>
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            </#if>
            }
            <#break >
        <#case "Map">
            final def ${method.name}AsScala(value: Option[${fullTypeName}]): ${simpleTypeName}.Builder = {
            <#assign valueTypeName=firstType.valueTypeDesc.simpleTypeName>
            <#if valueTypeName == "String">
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            <#elseif valueTypeName == "Int">
                value.filter(_.nonEmpty).map(_.view.map{ case (k, v) => (k, v.asInstanceOf[java.lang.Integer]) }.toMap).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) }
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                value.filter(_.nonEmpty).map(_.view.map{ case (k, v) => (k, v.asInstanceOf[java.lang.${valueTypeName}]) }.toMap).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) }
            <#elseif valueTypeName == "Map">
                <#local mapValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.map(_.asJava).asJava) } 
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if seqValueTypeName == "Map">
                    value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.view.map{ case (k, v) => (k, v.map(_.asJava).asJava)}.toMap.asJava) }
                <#else>
                    value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.view.map{ case (k, v) => (k, v.asJava) }.toMap.asJava) }
                </#if>
            <#else>
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.${methodName}(v.asJava) } 
            </#if>
            }
            <#break >
        <#default >
            final def ${method.name}AsScala(value: Option[${fullTypeName}]): ${simpleTypeName}.Builder = {
            value.fold(self){ v => self.${methodName}(v) }
            } 
            <#break >
    </#switch>
</#macro>

<#macro enrichGetterAsScala simpleTypeName method>
    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
    <#local methodName=escapeMethodName(method.name)/>
    <#local firstType=method.returnTypeDesc/>
    <#local typeName=filterTypeName(firstType.simpleTypeName)/>
    <#local fullTypeName=filterTypeName(firstType.fullTypeName)/>
    <#switch typeName>
        <#case "Seq">
            <#local valueTypeName=firstType.valueTypeDesc.simpleTypeName/>
            <#if valueTypeName == "SdkBytes">
                final def ${method.name}AsScala: Option[Seq[software.amazon.awssdk.core.SdkBytes]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                final def ${method.name}AsScala: Option[Seq[Seq[${filterTypeName(seqValueTypeName)}]]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.asScala) } 
            <#elseif valueTypeName == "Map">
                <#local mapKeyTypeName=firstType.valueTypeDesc.keyTypeDesc.simpleTypeName>
                <#local mapValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                final def ${method.name}AsScala: Option[Seq[Map[${mapKeyTypeName}, ${filterTypeName(mapValueTypeName)}]]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.asScala.toMap) } 
            <#elseif valueTypeName == "String">
                final def ${method.name}AsScala: Option[Seq[String]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                final def ${method.name}AsScala: Option[Seq[${filterTypeName(valueTypeName)}]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.${valueTypeName?uncap_first}Value()) } 
            <#else>
                final def ${method.name}AsScala: Option[Seq[${filterTypeName(valueTypeName)}]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 
            </#if>
            <#break >
        <#case "Map">
            <#local keyTypeName=firstType.keyTypeDesc.simpleTypeName>
            <#local valueTypeName=firstType.valueTypeDesc.simpleTypeName>
            <#if valueTypeName == "SdkBytes">
                final def ${method.name}AsScala: Option[Map[${keyTypeName}, software.amazon.awssdk.core.SdkBytes]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 
            <#elseif valueTypeName == "Seq">
                <#local seqValueTypeName=firstType.valueTypeDesc.valueTypeDesc.simpleTypeName>
                <#if seqValueTypeName=="Map">
                    <#local mapKeyTypeName=firstType.valueTypeDesc.valueTypeDesc.keyTypeDesc.simpleTypeName>
                    <#local mapValueTypeName=firstType.valueTypeDesc.valueTypeDesc.valueTypeDesc.simpleTypeName>
                    final def ${method.name}AsScala: Option[Map[${keyTypeName}, Seq[Map[${mapKeyTypeName},${filterTypeName(mapValueTypeName)}]]]] = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap.view.map{ case (k, v) => (k, v.asScala.map(_.asScala.toMap)) }.toMap }
                <#else>
                    final def ${method.name}AsScala: Option[Map[${keyTypeName},Seq[${filterTypeName(seqValueTypeName)}]]]  = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap.view.map{ case (k, v) => (k, v.asScala) }.toMap }
                </#if>
            <#elseif valueTypeName == "String">
                final def ${method.name}AsScala: Option[Map[${keyTypeName}, ${filterTypeName(valueTypeName)}]]  = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 
            <#elseif isDefined(valueTypeName) && valueTypeName != "String">
                final def ${method.name}AsScala: Option[Map[${keyTypeName}, ${filterTypeName(valueTypeName)}]]  = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap.view.map{ case (k, v) => (k, v.${valueTypeName?uncap_first}Value()) }.toMap }
            <#else>
                final def ${method.name}AsScala: Option[Map[${keyTypeName}, ${filterTypeName(valueTypeName)}]]  = Option(self.${methodName}).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 
            </#if>
            <#break >
        <#case "SdkBytes">
            final def ${method.name}AsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.${methodName}) 
            <#break >
        <#default >
            final def ${method.name}AsScala: Option[${fullTypeName}] = Option(self.${methodName}) 
            <#break >
    </#switch>
</#macro>


<#macro defScalaInterface method>
    def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): M[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]
</#macro>

<#macro defScalaFutureMethod method overrideOpt=true>
    <#--/**-->
    <#--* @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/${baseName?lower_case}/${simpleTypeName}.html#${method.name}-software.amazon.awssdk.services.cloudwatch.model.${fullTypeName}--->
    <#--*/-->
    <#if !method.name?ends_with("Paginator") && method.returnTypeDesc.valueTypeDesc.simpleTypeName == "Unit">
        @SuppressWarnings(Array("org.wartremover.warts.Equals"))
    </#if>
    <#if !method.name?ends_with("Paginator") && overrideOpt>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Future[${method.returnTypeDesc.valueTypeDesc.simpleTypeName}]</#if> =
    <#if method.name?ends_with("Paginator")>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        <#if method.returnTypeDesc.valueTypeDesc.simpleTypeName == "Unit">
            {
            val p = scala.concurrent.Promise[Unit]()
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).whenCompleteAsync(
            new java.util.function.BiConsumer[Void, Throwable] {
            override def accept(t: Void, u: Throwable): Unit = {
            if (u != null) p.failure(u)
            else p.success(())
            }
            })
            p.future
            }
        <#else>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toScala
        </#if>
    </#if>
</#macro>

<#macro defScalaEitherMethod method>
    <#if !method.name?ends_with("Paginator")>override</#if> def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): <#if method.name?ends_with("Paginator")>${method.returnTypeDesc.simpleTypeName}<#else>Either[Throwable, ${method.returnTypeDesc.simpleTypeName}]</#if> =
    <#if method.name?ends_with("Paginator")>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>).toEither
    </#if>
</#macro>

<#macro defCatsMethod method>
    <#if method.name?ends_with("Paginator")>
        def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): ${method.returnTypeDesc.simpleTypeName} =
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
    <#else>
        <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
        override def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): IO[${responseTypeName}] =
        IO.fromFuture {
        IO(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
        }
    </#if>
</#macro>

<#macro defMonixMethod method>
    <#if method.name?ends_with("Paginator")>
        <#assign responseTypeName=method.returnTypeDesc.simpleTypeName?replace("Publisher$", "Response", "r")>
        def ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Observable[${responseTypeName}] =
        Observable.fromReactivePublisher(underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>))
    <#else>
        <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
        override def  ${method.name}(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list>): Task[${responseTypeName}] =
        Task.deferFuture {
        underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
        }
    </#if>
</#macro>


<#macro defAkkaMethod method>
    <#if method.name?ends_with("Paginator")>
        <#if method.parameterTypeDescs?has_content>
            <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
            <#assign responseTypeName=requestTypeName?replace("Request$", "Response", "r")>
            def ${method.name}Flow: Flow[${requestTypeName},${responseTypeName}, NotUsed] = Flow[${requestTypeName}].flatMapConcat { request =>
            Source.fromPublisher(underlying.${method.name}(request))
            }
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.simpleTypeName?replace("Publisher$", "Response", "r")>
            def ${method.name}Source: Source[${responseTypeName}, NotUsed] =
            Source.fromPublisher(underlying.${method.name}())
        </#if>
    <#else>
        <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
        <#if method.parameterTypeDescs?has_content>
            def ${method.name}Source(<#list method.parameterTypeDescs as p>${p.name}: ${p.parameterTypeDesc.fullTypeName}<#if p_has_next>,</#if></#list><#if method.parameterTypeDescs?has_content>,</#if> parallelism: Int = DefaultParallelism): Source[${responseTypeName}, NotUsed] =
            Source.single(<#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].name}<#else>(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)</#if>).via(${method.name}Flow(parallelism))

            def ${method.name}Flow(parallelism: Int = DefaultParallelism): Flow[<#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].fullTypeName}<#else>(<#list method.parameterTypeDescs as p>${p.fullTypeName}<#if p_has_next>,</#if></#list>)</#if>,${responseTypeName}, NotUsed] =
            Flow[<#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].fullTypeName}<#else>(<#list method.parameterTypeDescs as p>${p.fullTypeName}<#if p_has_next>,</#if></#list>)</#if>].mapAsync(parallelism){ <#if method.parameterTypeDescs?size == 1>${method.parameterTypeDescs[0].name}<#else>case (<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)</#if> =>
            underlying.${method.name}(<#list method.parameterTypeDescs as p>${p.name}<#if p_has_next>,</#if></#list>)
            }
        <#else>
            def ${method.name}Source(): Source[${responseTypeName}, NotUsed] =
            Source.fromFuture(underlying.${method.name}())
        </#if>
    </#if>
</#macro>
