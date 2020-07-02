// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListShardsResponseBuilderOps(val self: ListShardsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardsAsScala(value: Option[Seq[Shard]]): ListShardsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.shards(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListShardsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListShardsResponseOps(val self: ListShardsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardsAsScala: Option[Seq[Shard]] =
    Option(self.shards).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListShardsResponseOps {

  implicit def toListShardsResponseBuilderOps(v: ListShardsResponse.Builder): ListShardsResponseBuilderOps =
    new ListShardsResponseBuilderOps(v)

  implicit def toListShardsResponseOps(v: ListShardsResponse): ListShardsResponseOps = new ListShardsResponseOps(v)

}
