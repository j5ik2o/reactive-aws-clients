// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionConfigurationRequestBuilderOps(val self: UpdateFunctionConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[Int]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala(value: Option[Int]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala(value: Option[VpcConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Environment]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala(value: Option[Runtime]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala(value: Option[TracingConfig]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): UpdateFunctionConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala(value: Option[Seq[String]]): UpdateFunctionConfigurationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layers(v.asJava)
    }
  }

}

final class UpdateFunctionConfigurationRequestOps(val self: UpdateFunctionConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala: Option[String] = Option(self.role)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala: Option[String] = Option(self.handler)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala: Option[Int] = Option(self.memorySize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala: Option[VpcConfig] = Option(self.vpcConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Environment] = Option(self.environment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala: Option[Runtime] = Option(self.runtime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala: Option[TracingConfig] = Option(self.tracingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala: Option[Seq[String]] = Option(self.layers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
