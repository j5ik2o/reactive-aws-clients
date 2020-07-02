// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ListApiKeysResponseBuilderOps(val self: ListApiKeysResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiKeysAsScala(value: Option[Seq[ApiKey]]): ListApiKeysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.apiKeys(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListApiKeysResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListApiKeysResponseOps(val self: ListApiKeysResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiKeysAsScala: Option[Seq[ApiKey]] =
    Option(self.apiKeys).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListApiKeysResponseOps {

  implicit def toListApiKeysResponseBuilderOps(v: ListApiKeysResponse.Builder): ListApiKeysResponseBuilderOps =
    new ListApiKeysResponseBuilderOps(v)

  implicit def toListApiKeysResponseOps(v: ListApiKeysResponse): ListApiKeysResponseOps = new ListApiKeysResponseOps(v)

}
