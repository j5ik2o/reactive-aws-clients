// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListPartsResponseBuilderOps(val self: ListPartsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortDateAsScala(value: Option[java.time.Instant]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortRuleIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortRuleId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.partNumberMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextPartNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.nextPartNumberMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxPartsAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.maxParts(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala(value: Option[Boolean]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partsAsScala(value: Option[Seq[Part]]): ListPartsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def initiatorAsScala(value: Option[Initiator]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.initiator(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[StorageClass]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class ListPartsResponseOps(val self: ListPartsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberMarkerAsScala: Option[Int] = Option(self.partNumberMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextPartNumberMarkerAsScala: Option[Int] = Option(self.nextPartNumberMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxPartsAsScala: Option[Int] = Option(self.maxParts)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partsAsScala: Option[Seq[Part]] = Option(self.parts).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def initiatorAsScala: Option[Initiator] = Option(self.initiator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPartsResponseOps {

  implicit def toListPartsResponseBuilderOps(v: ListPartsResponse.Builder): ListPartsResponseBuilderOps =
    new ListPartsResponseBuilderOps(v)

  implicit def toListPartsResponseOps(v: ListPartsResponse): ListPartsResponseOps = new ListPartsResponseOps(v)

}
