package com.github.j5ik2o.reactive.aws.utils

import scala.collection.JavaConverters._
import java.util

final class ScalaMapOps[K, V](val self: Map[K, V]) extends AnyVal {
  final def asJava: util.Map[K, V] = self.asJava
}

final class ScalaSeqOps[A](val self: Seq[A]) extends AnyVal {
  final def asJava: util.List[A] = self.asJava
}

final class JavaMapOps[K, V](val self: util.Map[K, V]) extends AnyVal {
  final def asScala: Map[K, V] = self.asScala.toMap
}

final class JavaListOps[A](val self: java.util.List[A]) extends AnyVal {
  final def asScala: Seq[A] = self.asScala
}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
object JavaCollectionHelper {
  implicit def toScalaSeqOps[A](self: Seq[A]): ScalaSeqOps[A]          = new ScalaSeqOps[A](self)
  implicit def toScalaMapOps[K, V](self: Map[K, V]): ScalaMapOps[K, V] = new ScalaMapOps[K, V](self)

  implicit def toJavaListOps[A](self: java.util.List[A]): JavaListOps[A]       = new JavaListOps[A](self)
  implicit def toJavaMapOps[K, V](self: java.util.Map[K, V]): JavaMapOps[K, V] = new JavaMapOps[K, V](self)
}
