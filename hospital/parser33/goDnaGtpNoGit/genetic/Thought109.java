package genetic;
import java.util.ArrayList;
class Thought109 extends Thought{
private static ArrayList<Thought109> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 506.14354884502694;
private double fd1 = 123.48058043782713;
private Thought fo0 = null;
private Thought fo1 = null;
Thought109 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought109 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought109 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought109 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought109 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought109 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought109 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought109 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought109 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought109 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought109 instance = new Thought109 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fd1 *= -1;
    double ld0 = 460.03755102865705;
    ld0 = fd0 + fd1;
    fb1 = ld0 < fd0;
    fb0 = !fb1;
    fd1 = ld0 - fd0;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought397.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought271.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
    fd0 *= -1;
    fb1 = fd1 < ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb3);
}
    lb4 = !fb0;
    Output.points[6][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = lb3 || lb4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = fd0 < fd1;
    boolean lb1 = false;
        fd0 *= -1;
    ab3 = fd1 > fd0;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, lb1);
}
    double ld2 = 888.2715815406159;
    Thought lo3 = Thought178.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought304.getInstance(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
    ab1 = ab2 && ab3;
    ld2 *= -1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought310.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
if(fo0 != null){
          fo0.m3();
}
        }
    boolean lb1 = true;
    fb0 = ad3 < ad4;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
    fd1 *= -1;
    Output.points[6][8] -= ad1;
    Output.points[7][0] += ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
        ad1 = ad2 - ad3;
    Thought lo2 = Thought365.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
    double ld3 = 961.1703098162652;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    lb1 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    ab1 = ad4 < fd0;
    boolean lb0 = false;
    if (ab1) {
        double ld1 = 398.0619517211069;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, ad1, ad2);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
        ab2 = ad1 < ad2;
if(fo1 != null){
          fo1.m3();
}
        Output.points[7][1] += ad3;
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, lb0, ab1, ab2, ab3);
}
            ad3 = ad4 - fd0;
if(fo0 != null){
              fo1 = fo0.m4(fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb0);
}
            ab1 = !ab2;
            double ld2 = 237.01922816292395;
            ab3 = ad2 > ad3;
            ad4 *= -1;
            ab4 = fd0 < fd1;
            ld2 = ld1 - ad1;
            fb0 = ad2 < ad3;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
            Thought lo3 = Thought92.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, fb0, fb1);
}
    fd1 *= -1;
    lb0 = lb1 || fb0;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    if (fb0) {
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        ad3 *= -1;
        Output.points[7][2] -= ad4;
if(ao2 != null){
          ao2.m3(fb1, fb0, fb1, fb0);
}
        } else {
        fb1 = fd0 > fd1;
        Output.points[7][3] += ad1;
        for(int i0=0; i0<10; i0++){
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 668.7541031058578;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    if (ab2) {
        ab3 = ld0 < fd0;
        Output.points[7][4] -= fd1;
if(fo1 != null){
          fo1.m2(ld0, fd0, fd1, ld0);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
        ab4 = ld0 < fd0;
if(fo1 != null){
          fo1.m2();
}
if(ao1 != null){
          fd1 = ao1.m3(fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought254.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
        fd0 = fd1 + ld0;
        double ld2 = 983.3691446994131;
        ab1 = ab2 || ab3;
if(fo1 != null){
          ab4 = fo1.m2(ld0, fd0, fd1, ld2, fb0, fb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    double ld0 = 988.7815123339852;
    ab1 = ad4 > fd0;
    Thought lo1 = Thought139.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    double ld2 = 62.44748129447464;
    Thought lo3 = Thought15.getInstance(fo0, fo1, ao1, ao2);
    ab3 = ab4 || fb0;
    boolean lb4 = false;
    Thought lo5 = Thought86.getInstance(fd0, fd1, ld0, ld2);
    boolean lb6 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    ab4 = fd0 < fd1;
    boolean lb7 = true;
    boolean lb8 = true;
if(ao3 != null){
      ab3 = ao3.m2();
}
    boolean lb9 = true;
    Output.points[7][5] -= ld0;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ld2 = ad1 - ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb4, lb6, lb7, lb8);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld2, ad1, ad2, lb9, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought316.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld3 = 730.7725525159406;
if(fo0 != null){
      ld3 = fo0.m3();
}
    fd0 = fd1 - ld3;
    fd0 = fd1 + ld3;
    fd0 = fd1 + ld3;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fd1, ld3, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = ld3 < fd0;
    fb0 = fb1 && lb0;
    fd1 = ld3 - fd0;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought8.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 && ab1;
    boolean lb1 = true;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    double ld2 = 626.090612618756;
if(fo1 != null){
      fb1 = fo1.m2(ld2, fd0, fd1, ld2);
}
    lb1 = fd0 > fd1;
    ld2 *= -1;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld0 = 774.8470665158993;
    ld0 = ad1 - ad2;
    double ld1 = 423.0523138662241;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[7][6] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
        ab1 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ab2 = ab3 || ab4;
        double ld0 = 881.1574962648259;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 || ab1;
            ab2 = !ab3;
if(fo1 != null){
              ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
            Thought lo1 = Thought166.getInstance(fo0, fo1, fo0, fo1);
            Thought lo2 = Thought71.getInstance(ad1, ad2, ad3, ad4);
            Output.points[7][7] -= fd0;
            fd1 = ld0 - ad1;
}}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 279.93560724095926;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought218.getInstance();
    fb0 = fd1 < ld0;
    fb1 = !fb0;
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought92.getInstance(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 *= -1;
    Output.points[7][8] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && fb0;
    Output.points[8][0] += fd1;
if(ao2 != null){
      fb1 = ao2.m2(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    boolean lb0 = true;
    Output.points[8][1] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    Output.points[8][2] += ad2;
    fb1 = lb0 && fb0;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought66.getInstance(ad4, fd0, fd1, ad1, lb0, lb1, fb0, fb1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
    ad3 = ad4 - fd0;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][3] -= fd1;
    boolean lb0 = true;
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 357.850154694246;
    Thought lo2 = Thought104.getInstance(ld1, fd0, fd1, ld1);
    boolean lb3 = false;
    fd0 = fd1 - ld1;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought280.getInstance();
    double ld1 = 433.20736893786716;
    ab1 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    ld1 *= -1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo3 = Thought67.getInstance(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - ld1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    ab4 = fd0 > fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
if(ao2 != null){
      lb2 = ao2.m2();
}
    Thought lo4 = Thought253.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb0, fb1, lb2, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    Output.points[8][4] += ad1;
    fb1 = lb2 && ab1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought341.getInstance(ao4, fo0, fo1, ao1);
    fb1 = fd0 > fd1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[8][5] -= fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    lb0 = lb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2();
}
    Thought lo2 = Thought170.getInstance(lb0, lb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    if (lb1) {
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    boolean lb0 = true;
    double ld1 = 27.27037099509883;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
    ab1 = !ab2;
    fd1 *= -1;
    ab3 = ld1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought11.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
    boolean lb3 = true;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
        double ld0 = 817.3431317279345;
    Output.points[8][6] += ad1;
    double ld1 = 912.4888393889056;
    fb0 = fb1 || fb0;
    ad1 *= -1;
    double ld2 = 188.0163405233072;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
    double ld3 = 897.3986563981063;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought142.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
        double ld4 = 521.0273715375141;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fb1, lb0, lb2, lb3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld4, ad1, fb0, fb1, lb0, lb2);
}
        ad2 = ad3 + ad4;
    Thought lo5 = Thought281.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[8][7] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][8] += fd0;
    double ld0 = 249.56791124119238;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    double ld0 = 847.6125846855587;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Output.points[0][0] -= ld0;
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 + fd1;
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
if(ao2 != null){
      fd0 = ao2.m3();
}
    boolean lb0 = true;
        fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m2(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = !ab1;
    double ld1 = 416.2372217978421;
    ab2 = ld1 < fd0;
    fd1 = ld1 - fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    double ld0 = 916.295889962328;
    ad2 *= -1;
    boolean lb1 = false;
    ad3 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought124.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(lb2, ab1, ab2, ab3);
}
    Output.points[0][1] -= fd0;
    ab4 = fb0 || fb1;
    boolean lb4 = false;
    boolean lb5 = true;
    Output.points[0][2] += fd1;
    lb1 = ld0 > ad1;
    Output.points[0][3] -= ad2;
    Output.points[0][4] += ad3;
    lb2 = !lb4;
    ad4 = fd0 - fd1;
    lb5 = ld0 > ad1;
    ab1 = ab2 || ab3;
    Output.points[0][5] += ad2;
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought202.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][6] += fd0;
    double ld2 = 912.6309379219149;
    Thought lo3 = Thought17.getInstance(fd0, fd1, ld2, fd0);
    fd1 = ld2 - fd0;
    fd1 = ld2 + fd0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    boolean lb4 = true;
    double ld5 = 716.9354845987899;
    boolean lb6 = false;
    boolean lb7 = true;
if(fo0 != null){
      fo0.m2();
}
    lb1 = !lb4;
    ld2 = ld5 + fd0;
    lb6 = fd1 < ld2;
    double ld8 = 692.1266464351402;
    boolean lb9 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb7, lb9, fb0, fb1);
}
    ld5 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld0 = 834.087203499596;
    ab3 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = !fb0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    double ld1 = 578.5709294727519;
    Thought lo2 = Thought331.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + ld1;
    if (fb1) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
        ab4 = fd1 > ld0;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
          ad3 = fo0.m3(fb1, lb0, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    Output.points[0][7] += ad4;
    lb0 = lb1 && fb0;
    Thought lo2 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
    Output.points[0][8] += ad3;
    fb1 = !lb0;
    boolean lb3 = false;
    lb1 = lb3 || fb0;
    fb1 = lb0 && lb1;
    lb3 = ad4 < fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought396.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought209.getInstance(ad1, ad2, ad3, ad4);
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fd1 *= -1;
        fb1 = !fb0;
        Output.points[1][1] += fd0;
        fb1 = fd1 < fd0;
        boolean lb0 = false;
        fd1 *= -1;
        lb0 = fd0 > fd1;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        double ld2 = 580.334002724356;
        ld2 *= -1;
        lb0 = ad1 > ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb0 = ad3 > ad4;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld2, ad1);
}
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab3 = ab4 && fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    fd1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    lb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, lb2, ab1);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Output.points[1][2] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
        Thought lo2 = Thought195.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    lb3 = fb0 && fb1;
    double ld4 = 505.8505340786965;
    lb0 = lb1 || lb3;
    fb0 = fd0 > fd1;
    ld4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4);
}
    double ld5 = 72.68265687115836;
    fb1 = !lb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought75.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought388.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought83.getInstance(fo0, fo1, fo0, fo1);
    Output.points[1][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld3 = 547.0505714362536;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    Thought lo5 = Thought250.getInstance(ld3, fd0, fd1, ld3);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought79.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought202.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
