// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateStreamProcessorRequestBuilderOps(val self: CreateStreamProcessorRequest.Builder) extends AnyVal {

  final def inputAsScala(value: Option[StreamProcessorInput]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.input(v)
    }
  }

  final def outputAsScala(value: Option[StreamProcessorOutput]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.output(v)
    }
  }

  final def nameAsScala(value: Option[String]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def settingsAsScala(value: Option[StreamProcessorSettings]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.settings(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

}

final class CreateStreamProcessorRequestOps(val self: CreateStreamProcessorRequest) extends AnyVal {

  final def inputAsScala: Option[StreamProcessorInput] = Option(self.input)

  final def outputAsScala: Option[StreamProcessorOutput] = Option(self.output)

  final def nameAsScala: Option[String] = Option(self.name)

  final def settingsAsScala: Option[StreamProcessorSettings] = Option(self.settings)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStreamProcessorRequestOps {

  implicit def toCreateStreamProcessorRequestBuilderOps(
      v: CreateStreamProcessorRequest.Builder
  ): CreateStreamProcessorRequestBuilderOps = new CreateStreamProcessorRequestBuilderOps(v)

  implicit def toCreateStreamProcessorRequestOps(v: CreateStreamProcessorRequest): CreateStreamProcessorRequestOps =
    new CreateStreamProcessorRequestOps(v)

}
