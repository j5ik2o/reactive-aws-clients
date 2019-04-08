// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateFunctionResponseBuilderOps(val self: CreateFunctionResponse.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def functionArnAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  final def runtimeAsScala(value: Option[Runtime]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  }

  final def roleAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  final def handlerAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  }

  final def codeSizeAsScala(value: Option[Long]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.codeSize(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def timeoutAsScala(value: Option[Int]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  final def memorySizeAsScala(value: Option[Int]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  }

  final def lastModifiedAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  final def codeSha256AsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  }

  final def versionAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def vpcConfigAsScala(value: Option[VpcConfigResponse]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  }

  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  }

  final def environmentAsScala(value: Option[EnvironmentResponse]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  }

  final def kmsKeyArnAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  }

  final def tracingConfigAsScala(value: Option[TracingConfigResponse]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  }

  final def masterArnAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.masterArn(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): CreateFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

  final def layersAsScala(value: Option[Seq[Layer]]): CreateFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    }
  }

}

final class CreateFunctionResponseOps(val self: CreateFunctionResponse) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  final def runtimeAsScala: Option[Runtime] = Option(self.runtime)

  final def roleAsScala: Option[String] = Option(self.role)

  final def handlerAsScala: Option[String] = Option(self.handler)

  final def codeSizeAsScala: Option[Long] = Option(self.codeSize)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  final def memorySizeAsScala: Option[Int] = Option(self.memorySize)

  final def lastModifiedAsScala: Option[String] = Option(self.lastModified)

  final def codeSha256AsScala: Option[String] = Option(self.codeSha256)

  final def versionAsScala: Option[String] = Option(self.version)

  final def vpcConfigAsScala: Option[VpcConfigResponse] = Option(self.vpcConfig)

  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig)

  final def environmentAsScala: Option[EnvironmentResponse] = Option(self.environment)

  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn)

  final def tracingConfigAsScala: Option[TracingConfigResponse] = Option(self.tracingConfig)

  final def masterArnAsScala: Option[String] = Option(self.masterArn)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

  final def layersAsScala: Option[Seq[Layer]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFunctionResponseOps {

  implicit def toCreateFunctionResponseBuilderOps(v: CreateFunctionResponse.Builder): CreateFunctionResponseBuilderOps =
    new CreateFunctionResponseBuilderOps(v)

  implicit def toCreateFunctionResponseOps(v: CreateFunctionResponse): CreateFunctionResponseOps =
    new CreateFunctionResponseOps(v)

}
