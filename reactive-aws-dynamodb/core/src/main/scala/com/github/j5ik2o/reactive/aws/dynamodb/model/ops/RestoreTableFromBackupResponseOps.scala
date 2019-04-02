// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableFromBackupResponse => ScalaRestoreTableFromBackupResponse,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableFromBackupResponse => JavaRestoreTableFromBackupResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableFromBackupResponseOps {

  implicit class JavaRestoreTableFromBackupResponseOps(val self: JavaRestoreTableFromBackupResponse) extends AnyVal {

    def toScala: ScalaRestoreTableFromBackupResponse = {
      ScalaRestoreTableFromBackupResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTableDescription(Option(self.tableDescription).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}