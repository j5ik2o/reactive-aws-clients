// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConversionTaskBuilderOps(val self: ConversionTask.Builder) extends AnyVal {

  final def conversionTaskIdAsScala(value: Option[String]): ConversionTask.Builder = {
    value.fold(self) { v =>
      self.conversionTaskId(v)
    }
  }

  final def expirationTimeAsScala(value: Option[String]): ConversionTask.Builder = {
    value.fold(self) { v =>
      self.expirationTime(v)
    }
  }

  final def importInstanceAsScala(value: Option[ImportInstanceTaskDetails]): ConversionTask.Builder = {
    value.fold(self) { v =>
      self.importInstance(v)
    }
  }

  final def importVolumeAsScala(value: Option[ImportVolumeTaskDetails]): ConversionTask.Builder = {
    value.fold(self) { v =>
      self.importVolume(v)
    }
  }

  final def stateAsScala(value: Option[ConversionTaskState]): ConversionTask.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def statusMessageAsScala(value: Option[String]): ConversionTask.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ConversionTask.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ConversionTaskOps(val self: ConversionTask) extends AnyVal {

  final def conversionTaskIdAsScala: Option[String] = Option(self.conversionTaskId)

  final def expirationTimeAsScala: Option[String] = Option(self.expirationTime)

  final def importInstanceAsScala: Option[ImportInstanceTaskDetails] = Option(self.importInstance)

  final def importVolumeAsScala: Option[ImportVolumeTaskDetails] = Option(self.importVolume)

  final def stateAsScala: Option[ConversionTaskState] = Option(self.state)

  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConversionTaskOps {

  implicit def toConversionTaskBuilderOps(v: ConversionTask.Builder): ConversionTaskBuilderOps =
    new ConversionTaskBuilderOps(v)

  implicit def toConversionTaskOps(v: ConversionTask): ConversionTaskOps = new ConversionTaskOps(v)

}
