// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InferenceAcceleratorInfoBuilderOps(val self: InferenceAcceleratorInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceleratorsAsScala(value: Option[Seq[InferenceDeviceInfo]]): InferenceAcceleratorInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accelerators(v.asJava)
    }
  }

}

final class InferenceAcceleratorInfoOps(val self: InferenceAcceleratorInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceleratorsAsScala: Option[Seq[InferenceDeviceInfo]] = Option(self.accelerators).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInferenceAcceleratorInfoOps {

  implicit def toInferenceAcceleratorInfoBuilderOps(
      v: InferenceAcceleratorInfo.Builder
  ): InferenceAcceleratorInfoBuilderOps = new InferenceAcceleratorInfoBuilderOps(v)

  implicit def toInferenceAcceleratorInfoOps(v: InferenceAcceleratorInfo): InferenceAcceleratorInfoOps =
    new InferenceAcceleratorInfoOps(v)

}
