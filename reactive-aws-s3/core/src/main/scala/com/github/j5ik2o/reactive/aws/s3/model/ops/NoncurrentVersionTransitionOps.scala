// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class NoncurrentVersionTransitionBuilderOps(val self: NoncurrentVersionTransition.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentDaysAsScala(value: Option[Int]): NoncurrentVersionTransition.Builder = {
    value.fold(self) { v => self.noncurrentDays(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[TransitionStorageClass]): NoncurrentVersionTransition.Builder = {
    value.fold(self) { v => self.storageClass(v) }
  }

}

final class NoncurrentVersionTransitionOps(val self: NoncurrentVersionTransition) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentDaysAsScala: Option[Int] = Option(self.noncurrentDays)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[TransitionStorageClass] = Option(self.storageClass)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNoncurrentVersionTransitionOps {

  implicit def toNoncurrentVersionTransitionBuilderOps(
      v: NoncurrentVersionTransition.Builder
  ): NoncurrentVersionTransitionBuilderOps = new NoncurrentVersionTransitionBuilderOps(v)

  implicit def toNoncurrentVersionTransitionOps(v: NoncurrentVersionTransition): NoncurrentVersionTransitionOps =
    new NoncurrentVersionTransitionOps(v)

}
