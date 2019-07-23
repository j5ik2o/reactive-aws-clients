// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateStreamProcessorRequestBuilderOps(val self: CreateStreamProcessorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala(value: Option[StreamProcessorInput]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.input(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala(value: Option[StreamProcessorOutput]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.output(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala(value: Option[StreamProcessorSettings]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.settings(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): CreateStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

}

final class CreateStreamProcessorRequestOps(val self: CreateStreamProcessorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala: Option[StreamProcessorInput] = Option(self.input)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala: Option[StreamProcessorOutput] = Option(self.output)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala: Option[StreamProcessorSettings] = Option(self.settings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
