// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishVersionResponseBuilderOps(val self: PublishVersionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala(value: Option[Runtime]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeAsScala(value: Option[Long]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.codeSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[Int]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala(value: Option[Int]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala(value: Option[VpcConfigResponse]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[EnvironmentResponse]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala(value: Option[TracingConfigResponse]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterArnAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.masterArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): PublishVersionResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala(value: Option[Seq[Layer]]): PublishVersionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layers(v.asJava)
    }
  }

}

final class PublishVersionResponseOps(val self: PublishVersionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala: Option[Runtime] = Option(self.runtime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala: Option[String] = Option(self.role)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala: Option[String] = Option(self.handler)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeAsScala: Option[Long] = Option(self.codeSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala: Option[Int] = Option(self.memorySize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[String] = Option(self.lastModified)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala: Option[String] = Option(self.codeSha256)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[String] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala: Option[VpcConfigResponse] = Option(self.vpcConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[EnvironmentResponse] = Option(self.environment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala: Option[TracingConfigResponse] = Option(self.tracingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterArnAsScala: Option[String] = Option(self.masterArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala: Option[Seq[Layer]] = Option(self.layers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishVersionResponseOps {

  implicit def toPublishVersionResponseBuilderOps(v: PublishVersionResponse.Builder): PublishVersionResponseBuilderOps =
    new PublishVersionResponseBuilderOps(v)

  implicit def toPublishVersionResponseOps(v: PublishVersionResponse): PublishVersionResponseOps =
    new PublishVersionResponseOps(v)

}
