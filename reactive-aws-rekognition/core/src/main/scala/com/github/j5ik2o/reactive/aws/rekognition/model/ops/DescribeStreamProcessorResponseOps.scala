// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeStreamProcessorResponseBuilderOps(val self: DescribeStreamProcessorResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamProcessorArnAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.streamProcessorArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[StreamProcessorStatus]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala(value: Option[java.time.Instant]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.creationTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateTimestampAsScala(value: Option[java.time.Instant]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.lastUpdateTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala(value: Option[StreamProcessorInput]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.input(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala(value: Option[StreamProcessorOutput]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.output(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala(value: Option[StreamProcessorSettings]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.settings(v)
    }
  }

}

final class DescribeStreamProcessorResponseOps(val self: DescribeStreamProcessorResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamProcessorArnAsScala: Option[String] = Option(self.streamProcessorArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[StreamProcessorStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdateTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdateTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala: Option[StreamProcessorInput] = Option(self.input)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala: Option[StreamProcessorOutput] = Option(self.output)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala: Option[StreamProcessorSettings] = Option(self.settings)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamProcessorResponseOps {

  implicit def toDescribeStreamProcessorResponseBuilderOps(
      v: DescribeStreamProcessorResponse.Builder
  ): DescribeStreamProcessorResponseBuilderOps = new DescribeStreamProcessorResponseBuilderOps(v)

  implicit def toDescribeStreamProcessorResponseOps(
      v: DescribeStreamProcessorResponse
  ): DescribeStreamProcessorResponseOps = new DescribeStreamProcessorResponseOps(v)

}
