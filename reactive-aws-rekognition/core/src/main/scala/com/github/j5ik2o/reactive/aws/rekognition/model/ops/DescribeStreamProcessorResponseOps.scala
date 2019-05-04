// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeStreamProcessorResponseBuilderOps(val self: DescribeStreamProcessorResponse.Builder)
    extends AnyVal {

  final def nameAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def streamProcessorArnAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.streamProcessorArn(v)
    }
  }

  final def statusAsScala(value: Option[StreamProcessorStatus]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def creationTimestampAsScala(value: Option[java.time.Instant]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.creationTimestamp(v)
    }
  }

  final def lastUpdateTimestampAsScala(value: Option[java.time.Instant]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.lastUpdateTimestamp(v)
    }
  }

  final def inputAsScala(value: Option[StreamProcessorInput]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.input(v)
    }
  }

  final def outputAsScala(value: Option[StreamProcessorOutput]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.output(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def settingsAsScala(value: Option[StreamProcessorSettings]): DescribeStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.settings(v)
    }
  }

}

final class DescribeStreamProcessorResponseOps(val self: DescribeStreamProcessorResponse) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def streamProcessorArnAsScala: Option[String] = Option(self.streamProcessorArn)

  final def statusAsScala: Option[StreamProcessorStatus] = Option(self.status)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

  final def lastUpdateTimestampAsScala: Option[java.time.Instant] = Option(self.lastUpdateTimestamp)

  final def inputAsScala: Option[StreamProcessorInput] = Option(self.input)

  final def outputAsScala: Option[StreamProcessorOutput] = Option(self.output)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

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
