// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class FirelensConfigurationBuilderOps(val self: FirelensConfiguration.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[FirelensConfigurationType]): FirelensConfiguration.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def optionsAsScala(value: Option[Map[String, String]]): FirelensConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.options(v.asJava) } 
            }


}

final class FirelensConfigurationOps(val self: FirelensConfiguration) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[FirelensConfigurationType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def optionsAsScala: Option[Map[String, String]]  = Option(self.options).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFirelensConfigurationOps {

implicit def toFirelensConfigurationBuilderOps(v: FirelensConfiguration.Builder): FirelensConfigurationBuilderOps = new FirelensConfigurationBuilderOps(v)

implicit def toFirelensConfigurationOps(v: FirelensConfiguration): FirelensConfigurationOps = new FirelensConfigurationOps(v)

}

