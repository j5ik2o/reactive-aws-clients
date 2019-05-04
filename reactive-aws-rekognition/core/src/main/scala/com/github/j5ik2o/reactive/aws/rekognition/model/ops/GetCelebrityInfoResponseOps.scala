// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetCelebrityInfoResponseBuilderOps(val self: GetCelebrityInfoResponse.Builder) extends AnyVal {

  final def urlsAsScala(value: Option[Seq[String]]): GetCelebrityInfoResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.urls(v.asJava)
    }
  }

  final def nameAsScala(value: Option[String]): GetCelebrityInfoResponse.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class GetCelebrityInfoResponseOps(val self: GetCelebrityInfoResponse) extends AnyVal {

  final def urlsAsScala: Option[Seq[String]] = Option(self.urls).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCelebrityInfoResponseOps {

  implicit def toGetCelebrityInfoResponseBuilderOps(
      v: GetCelebrityInfoResponse.Builder
  ): GetCelebrityInfoResponseBuilderOps = new GetCelebrityInfoResponseBuilderOps(v)

  implicit def toGetCelebrityInfoResponseOps(v: GetCelebrityInfoResponse): GetCelebrityInfoResponseOps =
    new GetCelebrityInfoResponseOps(v)

}
