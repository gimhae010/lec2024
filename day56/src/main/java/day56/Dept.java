package day56;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int deptno;
	String dname;
	String loc;
}
