// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostReservationsResponseBuilderOps(val self: DescribeHostReservationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hostReservationSetAsScala(value: Option[Seq[HostReservation]]): DescribeHostReservationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostReservationSet(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeHostReservationsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeHostReservationsResponseOps(val self: DescribeHostReservationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def hostReservationSetAsScala: Option[Seq[HostReservation]] = Option(self.hostReservationSet).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostReservationsResponseOps {

implicit def toDescribeHostReservationsResponseBuilderOps(v: DescribeHostReservationsResponse.Builder): DescribeHostReservationsResponseBuilderOps = new DescribeHostReservationsResponseBuilderOps(v)

implicit def toDescribeHostReservationsResponseOps(v: DescribeHostReservationsResponse): DescribeHostReservationsResponseOps = new DescribeHostReservationsResponseOps(v)

}

