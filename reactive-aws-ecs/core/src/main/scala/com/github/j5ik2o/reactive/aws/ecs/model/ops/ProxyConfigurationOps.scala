// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ProxyConfigurationBuilderOps(val self: ProxyConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[ProxyConfigurationType]): ProxyConfiguration.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala(value: Option[String]): ProxyConfiguration.Builder = {
    value.fold(self) { v => self.containerName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propertiesAsScala(value: Option[Seq[KeyValuePair]]): ProxyConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.properties(v.asJava)
    }
  }

}

final class ProxyConfigurationOps(val self: ProxyConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[ProxyConfigurationType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerNameAsScala: Option[String] = Option(self.containerName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propertiesAsScala: Option[Seq[KeyValuePair]] =
    Option(self.properties).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProxyConfigurationOps {

  implicit def toProxyConfigurationBuilderOps(v: ProxyConfiguration.Builder): ProxyConfigurationBuilderOps =
    new ProxyConfigurationBuilderOps(v)

  implicit def toProxyConfigurationOps(v: ProxyConfiguration): ProxyConfigurationOps = new ProxyConfigurationOps(v)

}
