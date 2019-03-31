// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Delete => ScalaDelete, _ }
import software.amazon.awssdk.services.s3.model.{ Delete => JavaDelete }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteOps {

  implicit class ScalaDeleteOps(val self: ScalaDelete) extends AnyVal {

    def toJava: JavaDelete = {
      val result = JavaDelete.builder()
      self.objects.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, ObjectIdentifierOps._; result.objects(v.map(_.toJava).asJava)
      } // Seq[ObjectIdentifier]
      self.quiet.map(_.booleanValue).foreach(v => result.quiet(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaDeleteOps(val self: JavaDelete) extends AnyVal {

    def toScala: ScalaDelete = {
      ScalaDelete()
        .withObjects(Option(self.objects).map { v =>
          import scala.collection.JavaConverters._, ObjectIdentifierOps._; v.asScala.map(_.toScala)
        }) // Seq[ObjectIdentifier]
        .withQuiet(Option(self.quiet).map(_.booleanValue)) // Boolean
    }

  }

}
