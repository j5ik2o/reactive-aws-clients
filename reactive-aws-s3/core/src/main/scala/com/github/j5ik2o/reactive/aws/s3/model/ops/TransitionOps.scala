// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TransitionBuilderOps(val self: Transition.Builder) extends AnyVal {

  final def dateAsScala(value: Option[java.time.Instant]): Transition.Builder = {
    value.fold(self) { v =>
      self.date(v)
    }
  } // java.time.Instant

  final def daysAsScala(value: Option[Int]): Transition.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  } // Int

  final def storageClassAsScala(value: Option[TransitionStorageClass]): Transition.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // TransitionStorageClass

}

final class TransitionOps(val self: Transition) extends AnyVal {

  final def dateAsScala: Option[java.time.Instant] = Option(self.date) // java.time.Instant

  final def daysAsScala: Option[Int] = Option(self.days) // Int

  final def storageClassAsScala: Option[TransitionStorageClass] = Option(self.storageClass) // TransitionStorageClass

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitionOps {

  implicit def toTransitionBuilderOps(v: Transition.Builder): TransitionBuilderOps = new TransitionBuilderOps(v)

  implicit def toTransitionOps(v: Transition): TransitionOps = new TransitionOps(v)

}
