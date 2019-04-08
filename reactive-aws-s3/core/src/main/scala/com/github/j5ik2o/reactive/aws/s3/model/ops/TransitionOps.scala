// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class TransitionBuilderOps(val self: Transition.Builder) extends AnyVal {

  final def dateAsScala(value: Option[java.time.Instant]): Transition.Builder = {
    value.fold(self) { v =>
      self.date(v)
    }
  }

  final def daysAsScala(value: Option[Int]): Transition.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  }

  final def storageClassAsScala(value: Option[TransitionStorageClass]): Transition.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

}

final class TransitionOps(val self: Transition) extends AnyVal {

  final def dateAsScala: Option[java.time.Instant] = Option(self.date)

  final def daysAsScala: Option[Int] = Option(self.days)

  final def storageClassAsScala: Option[TransitionStorageClass] = Option(self.storageClass)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitionOps {

  implicit def toTransitionBuilderOps(v: Transition.Builder): TransitionBuilderOps = new TransitionBuilderOps(v)

  implicit def toTransitionOps(v: Transition): TransitionOps = new TransitionOps(v)

}
