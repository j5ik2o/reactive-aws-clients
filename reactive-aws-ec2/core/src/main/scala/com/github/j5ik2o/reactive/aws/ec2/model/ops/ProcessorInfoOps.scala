// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProcessorInfoBuilderOps(val self: ProcessorInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedArchitecturesAsScala(value: Option[Seq[ArchitectureType]]): ProcessorInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.supportedArchitectures(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sustainedClockSpeedInGhzAsScala(value: Option[Double]): ProcessorInfo.Builder = {
    value.fold(self) { v => self.sustainedClockSpeedInGhz(v) }
  }

}

final class ProcessorInfoOps(val self: ProcessorInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def supportedArchitecturesAsScala: Option[Seq[ArchitectureType]] =
    Option(self.supportedArchitectures).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sustainedClockSpeedInGhzAsScala: Option[Double] = Option(self.sustainedClockSpeedInGhz)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProcessorInfoOps {

  implicit def toProcessorInfoBuilderOps(v: ProcessorInfo.Builder): ProcessorInfoBuilderOps =
    new ProcessorInfoBuilderOps(v)

  implicit def toProcessorInfoOps(v: ProcessorInfo): ProcessorInfoOps = new ProcessorInfoOps(v)

}
