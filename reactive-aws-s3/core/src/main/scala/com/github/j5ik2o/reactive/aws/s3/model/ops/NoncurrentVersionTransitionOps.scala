// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class NoncurrentVersionTransitionBuilderOps(val self: NoncurrentVersionTransition.Builder) extends AnyVal {

  final def withNoncurrentDaysAsScala(value: Option[Int]): NoncurrentVersionTransition.Builder = {
    value.fold(self) { v =>
      self.noncurrentDays(v)
    }
  } // Int

  final def withStorageClassAsScala(value: Option[TransitionStorageClass]): NoncurrentVersionTransition.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

}

final class NoncurrentVersionTransitionOps(val self: NoncurrentVersionTransition) extends AnyVal {

  final def noncurrentDaysAsScala: Option[Int] = Option(self.noncurrentDays) // Int

  final def storageClassAsScala: Option[TransitionStorageClass] = Option(self.storageClass) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNoncurrentVersionTransitionOps {

  implicit def toNoncurrentVersionTransitionBuilderOps(
      v: NoncurrentVersionTransition.Builder
  ): NoncurrentVersionTransitionBuilderOps = new NoncurrentVersionTransitionBuilderOps(v)

  implicit def toNoncurrentVersionTransitionOps(v: NoncurrentVersionTransition): NoncurrentVersionTransitionOps =
    new NoncurrentVersionTransitionOps(v)

}
