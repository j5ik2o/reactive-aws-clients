// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TransitionBuilderOps(val self: Transition.Builder) extends AnyVal {

  final def withDateAsScala(value: Option[java.time.Instant]): Transition.Builder = {
    value.fold(self) { v =>
      self.date(v)
    }
  } // Instant

  final def withDaysAsScala(value: Option[Int]): Transition.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  } // Int

  final def withStorageClassAsScala(value: Option[TransitionStorageClass]): Transition.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

}

final class TransitionOps(val self: Transition) extends AnyVal {

  final def dateAsScala: Option[java.time.Instant] = Option(self.date) // Instant

  final def daysAsScala: Option[Int] = Option(self.days) // Int

  final def storageClassAsScala: Option[TransitionStorageClass] = Option(self.storageClass) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitionOps {

  implicit def toTransitionBuilderOps(v: Transition.Builder): TransitionBuilderOps = new TransitionBuilderOps(v)

  implicit def toTransitionOps(v: Transition): TransitionOps = new TransitionOps(v)

}
