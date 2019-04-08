// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NewDhcpConfigurationBuilderOps(val self: NewDhcpConfiguration.Builder) extends AnyVal {

  final def keyAsScala(value: Option[String]): NewDhcpConfiguration.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def valuesAsScala(value: Option[Seq[String]]): NewDhcpConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    }
  }

}

final class NewDhcpConfigurationOps(val self: NewDhcpConfiguration) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key)

  final def valuesAsScala: Option[Seq[String]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNewDhcpConfigurationOps {

  implicit def toNewDhcpConfigurationBuilderOps(v: NewDhcpConfiguration.Builder): NewDhcpConfigurationBuilderOps =
    new NewDhcpConfigurationBuilderOps(v)

  implicit def toNewDhcpConfigurationOps(v: NewDhcpConfiguration): NewDhcpConfigurationOps =
    new NewDhcpConfigurationOps(v)

}
