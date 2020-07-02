// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaInfoBuilderOps(val self: FpgaInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgasAsScala(value: Option[Seq[FpgaDeviceInfo]]): FpgaInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.fpgas(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalFpgaMemoryInMiBAsScala(value: Option[Int]): FpgaInfo.Builder = {
    value.fold(self) { v => self.totalFpgaMemoryInMiB(v) }
  }

}

final class FpgaInfoOps(val self: FpgaInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgasAsScala: Option[Seq[FpgaDeviceInfo]] =
    Option(self.fpgas).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalFpgaMemoryInMiBAsScala: Option[Int] = Option(self.totalFpgaMemoryInMiB)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaInfoOps {

  implicit def toFpgaInfoBuilderOps(v: FpgaInfo.Builder): FpgaInfoBuilderOps = new FpgaInfoBuilderOps(v)

  implicit def toFpgaInfoOps(v: FpgaInfo): FpgaInfoOps = new FpgaInfoOps(v)

}
