// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ NoncurrentVersionTransition => ScalaNoncurrentVersionTransition, _ }
import software.amazon.awssdk.services.s3.model.{ NoncurrentVersionTransition => JavaNoncurrentVersionTransition }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object NoncurrentVersionTransitionOps {

  implicit class ScalaNoncurrentVersionTransitionOps(val self: ScalaNoncurrentVersionTransition) extends AnyVal {

    def toJava: JavaNoncurrentVersionTransition = {
      val result = JavaNoncurrentVersionTransition.builder()
      self.noncurrentDays.map(_.intValue).foreach(v => result.noncurrentDays(v)) // Int
      self.storageClass.foreach { v =>
        import TransitionStorageClassOps._; result.storageClass(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaNoncurrentVersionTransitionOps(val self: JavaNoncurrentVersionTransition) extends AnyVal {

    def toScala: ScalaNoncurrentVersionTransition = {
      ScalaNoncurrentVersionTransition()
        .withNoncurrentDays(Option(self.noncurrentDays).map(_.intValue)) // Int
        .withStorageClass(Option(self.storageClass).map { v =>
          import TransitionStorageClassOps._; v.toScala
        }) // String
    }

  }

}
