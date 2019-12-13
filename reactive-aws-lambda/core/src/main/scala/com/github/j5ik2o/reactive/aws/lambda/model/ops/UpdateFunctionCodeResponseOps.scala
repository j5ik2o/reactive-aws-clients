// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionCodeResponseBuilderOps(val self: UpdateFunctionCodeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala(value: Option[Runtime]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSizeAsScala(value: Option[Long]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.codeSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[Int]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala(value: Option[Int]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala(value: Option[VpcConfigResponse]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[EnvironmentResponse]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala(value: Option[TracingConfigResponse]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterArnAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.masterArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala(value: Option[Seq[Layer]]): UpdateFunctionCodeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[State]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonCodeAsScala(value: Option[StateReasonCode]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.stateReasonCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateStatusAsScala(value: Option[LastUpdateStatus]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.lastUpdateStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateStatusReasonAsScala(value: Option[String]): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.lastUpdateStatusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateStatusReasonCodeAsScala(
      value: Option[LastUpdateStatusReasonCode]
  ): UpdateFunctionCodeResponse.Builder = {
    value.fold(self) { v =>
      self.lastUpdateStatusReasonCode(v)
    }
  }

}

final class UpdateFunctionCodeResponseOps(val self: UpdateFunctionCodeResponse) extends AnyVal {

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

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[State] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonAsScala: Option[String] = Option(self.stateReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateReasonCodeAsScala: Option[StateReasonCode] = Option(self.stateReasonCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateStatusAsScala: Option[LastUpdateStatus] = Option(self.lastUpdateStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateStatusReasonAsScala: Option[String] = Option(self.lastUpdateStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateStatusReasonCodeAsScala: Option[LastUpdateStatusReasonCode] =
    Option(self.lastUpdateStatusReasonCode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionCodeResponseOps {

  implicit def toUpdateFunctionCodeResponseBuilderOps(
      v: UpdateFunctionCodeResponse.Builder
  ): UpdateFunctionCodeResponseBuilderOps = new UpdateFunctionCodeResponseBuilderOps(v)

  implicit def toUpdateFunctionCodeResponseOps(v: UpdateFunctionCodeResponse): UpdateFunctionCodeResponseOps =
    new UpdateFunctionCodeResponseOps(v)

}
