// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionConfigurationRequestBuilderOps(val self: UpdateFunctionConfigurationRequest.Builder)
    extends AnyVal {

  final def functionNameAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def roleAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  } // String

  final def handlerAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def timeoutAsScala(value: Option[Int]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // Int

  final def memorySizeAsScala(value: Option[Int]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  } // Int

  final def vpcConfigAsScala(value: Option[VpcConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  } // VpcConfig

  final def environmentAsScala(value: Option[Environment]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  } // Environment

  final def runtimeAsScala(value: Option[Runtime]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  } // String

  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  } // DeadLetterConfig

  final def kmsKeyArnAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  } // String

  final def tracingConfigAsScala(value: Option[TracingConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  } // TracingConfig

  final def revisionIdAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

  final def layersAsScala(value: Option[Seq[String]]): UpdateFunctionConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    } // Seq[String]
  }

}

final class UpdateFunctionConfigurationRequestOps(val self: UpdateFunctionConfigurationRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def roleAsScala: Option[String] = Option(self.role) // String

  final def handlerAsScala: Option[String] = Option(self.handler) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def timeoutAsScala: Option[Int] = Option(self.timeout) // Int

  final def memorySizeAsScala: Option[Int] = Option(self.memorySize) // Int

  final def vpcConfigAsScala: Option[VpcConfig] = Option(self.vpcConfig) // VpcConfig

  final def environmentAsScala: Option[Environment] = Option(self.environment) // Environment

  final def runtimeAsScala: Option[Runtime] = Option(self.runtime) // String

  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig) // DeadLetterConfig

  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn) // String

  final def tracingConfigAsScala: Option[TracingConfig] = Option(self.tracingConfig) // TracingConfig

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

  final def layersAsScala: Option[Seq[String]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionConfigurationRequestOps {

  implicit def toUpdateFunctionConfigurationRequestBuilderOps(
      v: UpdateFunctionConfigurationRequest.Builder
  ): UpdateFunctionConfigurationRequestBuilderOps = new UpdateFunctionConfigurationRequestBuilderOps(v)

  implicit def toUpdateFunctionConfigurationRequestOps(
      v: UpdateFunctionConfigurationRequest
  ): UpdateFunctionConfigurationRequestOps = new UpdateFunctionConfigurationRequestOps(v)

}
