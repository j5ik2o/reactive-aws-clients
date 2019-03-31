// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Transition => ScalaTransition, _ }
import software.amazon.awssdk.services.s3.model.{ Transition => JavaTransition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransitionOps {

  implicit class ScalaTransitionOps(val self: ScalaTransition) extends AnyVal {

    def toJava: JavaTransition = {
      val result = JavaTransition.builder()
      self.date.foreach(v => result.date(v))                 // Instant
      self.days.map(_.intValue).foreach(v => result.days(v)) // Int
      self.storageClass.foreach { v =>
        import TransitionStorageClassOps._; result.storageClass(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaTransitionOps(val self: JavaTransition) extends AnyVal {

    def toScala: ScalaTransition = {
      ScalaTransition()
        .withDate(Option(self.date)) // Instant
        .withDays(Option(self.days).map(_.intValue)) // Int
        .withStorageClass(Option(self.storageClass).map { v =>
          import TransitionStorageClassOps._; v.toScala
        }) // String
    }

  }

}
