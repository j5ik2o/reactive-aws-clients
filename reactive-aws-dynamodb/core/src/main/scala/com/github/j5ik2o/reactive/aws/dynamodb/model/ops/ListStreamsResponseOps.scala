// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListStreamsResponseBuilderOps(val self: ListStreamsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamsAsScala(value: Option[Seq[Stream]]): ListStreamsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.streams(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedStreamArnAsScala(value: Option[String]): ListStreamsResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedStreamArn(v)
    }
  }

}

final class ListStreamsResponseOps(val self: ListStreamsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamsAsScala: Option[Seq[Stream]] = Option(self.streams).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastEvaluatedStreamArnAsScala: Option[String] = Option(self.lastEvaluatedStreamArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamsResponseOps {

  implicit def toListStreamsResponseBuilderOps(v: ListStreamsResponse.Builder): ListStreamsResponseBuilderOps =
    new ListStreamsResponseBuilderOps(v)

  implicit def toListStreamsResponseOps(v: ListStreamsResponse): ListStreamsResponseOps = new ListStreamsResponseOps(v)

}
