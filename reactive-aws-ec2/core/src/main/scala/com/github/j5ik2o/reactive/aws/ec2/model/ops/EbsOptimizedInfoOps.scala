// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EbsOptimizedInfoBuilderOps(val self: EbsOptimizedInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baselineBandwidthInMbpsAsScala(value: Option[Int]): EbsOptimizedInfo.Builder = {
    value.fold(self) { v => self.baselineBandwidthInMbps(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baselineThroughputInMBpsAsScala(value: Option[Double]): EbsOptimizedInfo.Builder = {
    value.fold(self) { v => self.baselineThroughputInMBps(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baselineIopsAsScala(value: Option[Int]): EbsOptimizedInfo.Builder = {
    value.fold(self) { v => self.baselineIops(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBandwidthInMbpsAsScala(value: Option[Int]): EbsOptimizedInfo.Builder = {
    value.fold(self) { v => self.maximumBandwidthInMbps(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumThroughputInMBpsAsScala(value: Option[Double]): EbsOptimizedInfo.Builder = {
    value.fold(self) { v => self.maximumThroughputInMBps(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumIopsAsScala(value: Option[Int]): EbsOptimizedInfo.Builder = {
    value.fold(self) { v => self.maximumIops(v) }
  }

}

final class EbsOptimizedInfoOps(val self: EbsOptimizedInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baselineBandwidthInMbpsAsScala: Option[Int] = Option(self.baselineBandwidthInMbps)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baselineThroughputInMBpsAsScala: Option[Double] = Option(self.baselineThroughputInMBps)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baselineIopsAsScala: Option[Int] = Option(self.baselineIops)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumBandwidthInMbpsAsScala: Option[Int] = Option(self.maximumBandwidthInMbps)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumThroughputInMBpsAsScala: Option[Double] = Option(self.maximumThroughputInMBps)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumIopsAsScala: Option[Int] = Option(self.maximumIops)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEbsOptimizedInfoOps {

  implicit def toEbsOptimizedInfoBuilderOps(v: EbsOptimizedInfo.Builder): EbsOptimizedInfoBuilderOps =
    new EbsOptimizedInfoBuilderOps(v)

  implicit def toEbsOptimizedInfoOps(v: EbsOptimizedInfo): EbsOptimizedInfoOps = new EbsOptimizedInfoOps(v)

}
