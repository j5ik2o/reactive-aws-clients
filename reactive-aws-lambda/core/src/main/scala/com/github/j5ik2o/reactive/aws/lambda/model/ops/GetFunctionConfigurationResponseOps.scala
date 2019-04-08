// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionConfigurationResponseBuilderOps(val self: GetFunctionConfigurationResponse.Builder)
    extends AnyVal {

  final def functionNameAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def functionArnAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  } // String

  final def runtimeAsScala(value: Option[Runtime]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  } // String

  final def roleAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  } // String

  final def handlerAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  } // String

  final def codeSizeAsScala(value: Option[Long]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.codeSize(v)
    }
  } // Long

  final def descriptionAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def timeoutAsScala(value: Option[Int]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // Int

  final def memorySizeAsScala(value: Option[Int]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  } // Int

  final def lastModifiedAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  } // String

  final def codeSha256AsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  } // String

  final def versionAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  } // String

  final def vpcConfigAsScala(value: Option[VpcConfigResponse]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  } // VpcConfigResponse

  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  } // DeadLetterConfig

  final def environmentAsScala(value: Option[EnvironmentResponse]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  } // EnvironmentResponse

  final def kmsKeyArnAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  } // String

  final def tracingConfigAsScala(value: Option[TracingConfigResponse]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  } // TracingConfigResponse

  final def masterArnAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.masterArn(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): GetFunctionConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

  final def layersAsScala(value: Option[Seq[Layer]]): GetFunctionConfigurationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    } // Seq[Layer]
  }

}

final class GetFunctionConfigurationResponseOps(val self: GetFunctionConfigurationResponse) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def functionArnAsScala: Option[String] = Option(self.functionArn) // String

  final def runtimeAsScala: Option[Runtime] = Option(self.runtime) // String

  final def roleAsScala: Option[String] = Option(self.role) // String

  final def handlerAsScala: Option[String] = Option(self.handler) // String

  final def codeSizeAsScala: Option[Long] = Option(self.codeSize) // Long

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def timeoutAsScala: Option[Int] = Option(self.timeout) // Int

  final def memorySizeAsScala: Option[Int] = Option(self.memorySize) // Int

  final def lastModifiedAsScala: Option[String] = Option(self.lastModified) // String

  final def codeSha256AsScala: Option[String] = Option(self.codeSha256) // String

  final def versionAsScala: Option[String] = Option(self.version) // String

  final def vpcConfigAsScala: Option[VpcConfigResponse] = Option(self.vpcConfig) // VpcConfigResponse

  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig) // DeadLetterConfig

  final def environmentAsScala: Option[EnvironmentResponse] = Option(self.environment) // EnvironmentResponse

  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn) // String

  final def tracingConfigAsScala: Option[TracingConfigResponse] = Option(self.tracingConfig) // TracingConfigResponse

  final def masterArnAsScala: Option[String] = Option(self.masterArn) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

  final def layersAsScala: Option[Seq[Layer]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Layer]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionConfigurationResponseOps {

  implicit def toGetFunctionConfigurationResponseBuilderOps(
      v: GetFunctionConfigurationResponse.Builder
  ): GetFunctionConfigurationResponseBuilderOps = new GetFunctionConfigurationResponseBuilderOps(v)

  implicit def toGetFunctionConfigurationResponseOps(
      v: GetFunctionConfigurationResponse
  ): GetFunctionConfigurationResponseOps = new GetFunctionConfigurationResponseOps(v)

}
