// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ServerSideEncryptionConfigurationBuilderOps(val self: ServerSideEncryptionConfiguration.Builder)
    extends AnyVal {

  final def rulesAsScala(value: Option[Seq[ServerSideEncryptionRule]]): ServerSideEncryptionConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.rules(v.asJava)
    }
  }

}

final class ServerSideEncryptionConfigurationOps(val self: ServerSideEncryptionConfiguration) extends AnyVal {

  final def rulesAsScala: Option[Seq[ServerSideEncryptionRule]] = Option(self.rules).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServerSideEncryptionConfigurationOps {

  implicit def toServerSideEncryptionConfigurationBuilderOps(
      v: ServerSideEncryptionConfiguration.Builder
  ): ServerSideEncryptionConfigurationBuilderOps = new ServerSideEncryptionConfigurationBuilderOps(v)

  implicit def toServerSideEncryptionConfigurationOps(
      v: ServerSideEncryptionConfiguration
  ): ServerSideEncryptionConfigurationOps = new ServerSideEncryptionConfigurationOps(v)

}
