// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DhcpConfigurationBuilderOps(val self: DhcpConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): DhcpConfiguration.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala(value: Option[Seq[AttributeValue]]): DhcpConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.values(v.asJava)
    }
  }

}

final class DhcpConfigurationOps(val self: DhcpConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala: Option[Seq[AttributeValue]] = Option(self.values).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDhcpConfigurationOps {

  implicit def toDhcpConfigurationBuilderOps(v: DhcpConfiguration.Builder): DhcpConfigurationBuilderOps =
    new DhcpConfigurationBuilderOps(v)

  implicit def toDhcpConfigurationOps(v: DhcpConfiguration): DhcpConfigurationOps = new DhcpConfigurationOps(v)

}
