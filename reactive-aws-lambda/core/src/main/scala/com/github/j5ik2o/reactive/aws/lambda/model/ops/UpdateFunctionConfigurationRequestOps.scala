// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionConfigurationRequestBuilderOps(val self: UpdateFunctionConfigurationRequest.Builder)
    extends AnyVal {

  final def functionNameAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def roleAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  final def handlerAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def timeoutAsScala(value: Option[Int]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  final def memorySizeAsScala(value: Option[Int]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  }

  final def vpcConfigAsScala(value: Option[VpcConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  }

  final def environmentAsScala(value: Option[Environment]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  }

  final def runtimeAsScala(value: Option[Runtime]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  }

  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  }

  final def kmsKeyArnAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  }

  final def tracingConfigAsScala(value: Option[TracingConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

  final def layersAsScala(value: Option[Seq[String]]): UpdateFunctionConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    }
  }

}

final class UpdateFunctionConfigurationRequestOps(val self: UpdateFunctionConfigurationRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def roleAsScala: Option[String] = Option(self.role)

  final def handlerAsScala: Option[String] = Option(self.handler)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  final def memorySizeAsScala: Option[Int] = Option(self.memorySize)

  final def vpcConfigAsScala: Option[VpcConfig] = Option(self.vpcConfig)

  final def environmentAsScala: Option[Environment] = Option(self.environment)

  final def runtimeAsScala: Option[Runtime] = Option(self.runtime)

  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig)

  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn)

  final def tracingConfigAsScala: Option[TracingConfig] = Option(self.tracingConfig)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

  final def layersAsScala: Option[Seq[String]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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
