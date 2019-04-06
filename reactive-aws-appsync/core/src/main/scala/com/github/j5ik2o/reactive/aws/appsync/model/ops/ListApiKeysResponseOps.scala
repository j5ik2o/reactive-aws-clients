// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListApiKeysResponseBuilderOps(val self: ListApiKeysResponse.Builder) extends AnyVal {

  final def withApiKeysAsScala(value: Option[Seq[ApiKey]]): ListApiKeysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.apiKeys(v.asJava)
    } // Seq[ApiKey]
  }

  final def withNextTokenAsScala(value: Option[String]): ListApiKeysResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListApiKeysResponseOps(val self: ListApiKeysResponse) extends AnyVal {

  final def apiKeysAsScala: Option[Seq[ApiKey]] = Option(self.apiKeys).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ApiKey]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListApiKeysResponseOps {

  implicit def toListApiKeysResponseBuilderOps(v: ListApiKeysResponse.Builder): ListApiKeysResponseBuilderOps =
    new ListApiKeysResponseBuilderOps(v)

  implicit def toListApiKeysResponseOps(v: ListApiKeysResponse): ListApiKeysResponseOps = new ListApiKeysResponseOps(v)

}
