// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ParquetInput => ScalaParquetInput, _ }
import software.amazon.awssdk.services.s3.model.{ ParquetInput => JavaParquetInput }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ParquetInputOps {

  implicit class ScalaParquetInputOps(val self: ScalaParquetInput) extends AnyVal {

    def toJava: JavaParquetInput = {
      val result = JavaParquetInput.builder()

      result.build()
    }

  }

  implicit class JavaParquetInputOps(val self: JavaParquetInput) extends AnyVal {

    def toScala: ScalaParquetInput = {
      ScalaParquetInput()
    }

  }

}
