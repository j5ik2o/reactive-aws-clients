// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketsResponseBuilderOps(val self: ListBucketsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketsAsScala(value: Option[Seq[Bucket]]): ListBucketsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.buckets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): ListBucketsResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

}

final class ListBucketsResponseOps(val self: ListBucketsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketsAsScala: Option[Seq[Bucket]] = Option(self.buckets).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketsResponseOps {

  implicit def toListBucketsResponseBuilderOps(v: ListBucketsResponse.Builder): ListBucketsResponseBuilderOps =
    new ListBucketsResponseBuilderOps(v)

  implicit def toListBucketsResponseOps(v: ListBucketsResponse): ListBucketsResponseOps = new ListBucketsResponseOps(v)

}
