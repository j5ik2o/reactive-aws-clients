package com.github.j5ik2o.reactive.aws.s3.v2

import com.github.j5ik2o.reactive.aws.model.AbortableInputStream
import software.amazon.awssdk.core.{ ResponseInputStream => JavaResponseInputStream }

object ResponseInputStreamOps {
  implicit class JavaResponseInputStreamOps[T](val self: JavaResponseInputStream[T]) extends AnyVal {
    def toScala: ScalaResponseInputStream[T] = {
      new ScalaResponseInputStream[T](self.response(), new AbortableInputStream())
    }
  }
}
