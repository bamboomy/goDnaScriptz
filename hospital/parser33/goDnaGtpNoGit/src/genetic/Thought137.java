package genetic;
import java.util.ArrayList;
class Thought137 extends Thought{
private static ArrayList<Thought137> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 368.6773968819326;
private double fd1 = 177.45208944966973;
private Thought fo0 = null;
private Thought fo1 = null;
Thought137 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought137 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought137 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought137 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought137 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought137 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought137 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought137 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought137 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought137 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought137 instance = new Thought137 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    if (fb1) {
        Thought lo0 = Thought333.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        fd1 *= -1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m1(fb0, fb1, fb0, fb1);
}
        double ld1 = 940.0767260864982;
        fb0 = !fb1;
        Output.points[1][6] -= ld1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        Thought lo2 = Thought151.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
        ld1 = fd0 - fd1;
        ld1 *= -1;
        double ld3 = 132.95326887640144;
        ld3 = fd0 + fd1;
        ld1 *= -1;
        ld3 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
        double ld0 = 852.3919953330753;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    Output.points[1][7] -= ld0;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought162.getInstance(fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
    Thought lo3 = Thought11.getInstance(fo0, fo1, fo0, fo1);
    ld0 *= -1;
    Thought lo4 = Thought324.getInstance(fd0, fd1, ld0, fd0);
    ab2 = fd1 < ld0;
    boolean lb5 = false;
    ab2 = ab3 && ab4;
    Thought lo6 = Thought143.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb5);
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
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    fb0 = !fb1;
    ad3 *= -1;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    Output.points[1][8] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    double ld0 = 345.24996928143446;
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought203.getInstance(fo1, fo0, fo1, fo0);
        ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;

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
    Output.points[2][0] -= ad1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        ab1 = !ab2;
        ab3 = !ab4;
        Thought lo0 = Thought396.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo1 != null){
          fo1.m2(fb0, fb1, ab1, ab2);
}
        double ld1 = 84.6770566338526;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld1, ad1, ad2);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
            ab4 = fb0 && fb1;
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
    Thought lo0 = Thought308.getInstance();
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    double ld1 = 942.1362252290219;
    fb0 = !fb1;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    fd0 = fd1 - ld1;
    Thought lo3 = Thought56.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
    boolean lb4 = false;
    fd1 *= -1;
    ld1 = fd0 + fd1;
    boolean lb5 = false;
    ld1 *= -1;
    lb5 = fb0 || fb1;
    fd0 = fd1 + ld1;
    Thought lo6 = Thought103.getInstance(ao1, ao2, ao3, ao4, lb2, lb4, lb5, fb0);

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
    double ld0 = 767.4481658976147;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought295.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        ad3 = ad4 - fd0;
        Thought lo2 = Thought182.getInstance();
        }
    fb0 = fd1 > ld0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[2][1] -= ad1;
    ad2 = ad3 - ad4;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;
    lb3 = ad2 > ad3;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    double ld1 = 182.00245314815203;
    boolean lb2 = false;
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought187.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
    fd0 *= -1;
    lb0 = fd1 > ld1;
    Thought lo5 = Thought58.getInstance();
    lb2 = lb3 || ab1;
        ab2 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought201.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, lb0, lb2, lb3, ab1);
    boolean lb7 = true;
        Thought lo8 = Thought365.getInstance(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    lb0 = !ab1;
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ao4.m2(fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
    boolean lb1 = true;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - ad1;
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
    Thought lo2 = Thought115.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb1, ab1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Output.points[2][2] -= ad2;
    double ld3 = 310.55431411700096;
if(ao3 != null){
      ab2 = ao3.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ld3 + ad1;
    Output.points[2][3] += ad2;
    Output.points[2][4] += ad3;
    ab3 = ab4 && fb0;
    ad4 *= -1;
    fd0 = fd1 + ld3;
    fb1 = lb0 && lb1;
    Thought lo4 = Thought238.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);

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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    Thought lo2 = Thought301.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    double ld3 = 250.3337312374342;
    fb0 = fb1 && lb0;
    lb1 = ld3 < fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 309.4214753110955;
    double ld1 = 568.5552710712515;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
    boolean lb2 = true;
        boolean lb3 = true;
    ab1 = ld0 < ld1;
    ab2 = fd0 > fd1;
    ab3 = ld0 > ld1;
    boolean lb4 = false;
    Output.points[2][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    lb0 = !lb1;
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought196.getInstance();
    boolean lb3 = true;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fb1 = fo1.m2(lb0, lb1, lb3, fb0);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1, lb1, lb3, lb4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb3);
}

Thought.STACK_COUNTER++;
return lb4;
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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    double ld1 = 712.9446121829537;
    ab3 = ad4 < fd0;
    double ld2 = 185.87448125255438;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ld2);
}
    Output.points[2][6] += ad1;
    ab4 = ad2 > ad3;
    Output.points[2][7] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
    fb0 = !fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought72.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought397.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);

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
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb0 = !fb1;
    if (fb0) {
        fb1 = fb0 || fb1;
        boolean lb0 = true;
        Thought lo1 = Thought382.getInstance();
        lb0 = ad1 > ad2;
        Thought lo2 = Thought192.getInstance(fb0, fb1, lb0, fb0);
        fb1 = lb0 && fb0;
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
        ad2 = ad3 + ad4;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2();
}
    Thought lo0 = Thought136.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[2][8] -= fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    Output.points[3][0] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    fd1 = fd0 - fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 *= -1;
    ab2 = ab3 || ab4;
    double ld0 = 789.2389473872981;
    double ld1 = 355.6761994447267;
    boolean lb2 = false;
if(ao2 != null){
      ld1 = ao2.m3(ad1, ad2, ad3, ad4);
}
    double ld3 = 502.018133900261;
    ad4 *= -1;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    double ld4 = 755.6374408374611;
    boolean lb5 = true;
    double ld6 = 474.4735663344729;
    Output.points[3][1] -= ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ld3);
}
    lb2 = lb5 || ab1;
    ld4 = ld6 - ad1;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}

Thought.STACK_COUNTER++;
return ab4;
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
      fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 465.5390260839627;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    Output.points[3][2] -= fd1;
    fb1 = !fb0;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
    fd0 = fd1 - fd0;
    Output.points[3][3] -= fd1;
    fd0 *= -1;
    ab2 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 333.48580164254656;
    boolean lb1 = true;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab2 = fd1 < ld0;
    double ld2 = 871.6979965956216;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return ld2;
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
    fb1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        }
    double ld0 = 505.1121154052041;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] -= fd0;
    Thought lo1 = Thought284.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;

Thought.STACK_COUNTER++;
return ad1;
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
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    if (ab2) {
        ab3 = !ab4;
        Output.points[3][5] -= ad3;
        fb0 = ad4 > fd0;
        fd1 = ad1 + ad2;
        fb1 = ad3 > ad4;
        ab1 = fd0 > fd1;
        ad1 = ad2 + ad3;
        for(int i0=0; i0<10; i0++){
            ab2 = ab3 || ab4;
            double ld0 = 107.36628124048893;
            ad3 *= -1;
            Thought lo1 = Thought72.getInstance(ad4, fd0, fd1, ld0);
            if (fb0) {
                Thought lo2 = Thought20.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] += fd0;
if(ao1 != null){
      fb1 = ao1.m2();
}
    fb0 = fd1 > fd0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    double ld1 = 281.15070676288684;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = lb0 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    ld1 = fd0 - fd1;
    lb0 = lb2 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;
    fb1 = lb0 && lb2;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought35.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
        ad1 = ad2 - ad3;
    fb0 = !fb1;
    Thought lo0 = Thought328.getInstance(fo1, ao1, ao2, ao3);
    boolean lb1 = true;
    lb1 = ad4 > fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 950.3707651160809;
    ld0 = fd0 - fd1;
        ab2 = ab3 || ab4;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
    Output.points[3][7] += ld0;
    Output.points[3][8] -= fd0;
    double ld2 = 551.3709886540021;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, ld2);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    ld0 = ld2 + fd0;
    fb1 = lb1 && ab1;
    boolean lb3 = false;
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ld2, fd0, fb0, fb1, lb1, lb3);
}
    double ld5 = 479.62675524352005;
    Output.points[4][0] += fd0;
    lb4 = ab1 || ab2;

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
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 689.8614783734731;
    Thought lo1 = Thought21.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ld0 - ad1;
    Output.points[4][1] += ad2;
    ab4 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
    ab3 = ab4 || fb0;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb2, lb3, ab1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    boolean lb4 = false;
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ld0, ad1, fb1, lb2, lb3, lb4);
}

Thought.STACK_COUNTER++;
return ad2;
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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[4][2] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought282.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    boolean lb4 = false;
        boolean lb5 = true;
    lb0 = !lb2;
    Thought lo6 = Thought263.getInstance();
    Output.points[4][3] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb4, lb5, fb0);
}
    boolean lb7 = true;
    if (fb0) {
        fd0 = fd1 + fd0;
        fb1 = !lb0;
        fd1 *= -1;
        fd0 = fd1 - fd0;
        boolean lb8 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb2, lb3, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb5, lb7, fb0, fb1);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 371.6176121038055;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    boolean lb1 = true;
    lb1 = !ab1;
    fd1 = ld0 - fd0;
    ab2 = !ab3;
        fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ab4 = ld0 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;

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
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 676.1384174431604;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo1 = Thought259.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 = ad1 + ad2;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 - fd0;
    lb2 = fd1 > ld0;
    ad1 *= -1;
    lb3 = !fb0;
    ad2 = ad3 - ad4;
    boolean lb4 = false;
    fd0 *= -1;
    boolean lb5 = false;
    fd1 *= -1;
    ld0 = ad1 - ad2;
    boolean lb6 = false;
if(fo1 != null){
          lb5 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return fo0;
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
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
    double ld1 = 759.390723683254;
    fd0 = fd1 - ld1;
    fb0 = fb1 && lb0;
    ad1 *= -1;
    Output.points[4][4] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld2 = 5.949526227977011;
    double ld3 = 351.39260975607255;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought42.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
    ld3 = ad1 + ad2;
    fb1 = lb0 && ab1;
if(fo0 != null){
      ab2 = fo0.m2();
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
    double ld0 = 472.07097853852224;
    fd0 = fd1 - ld0;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought300.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    Thought lo2 = Thought323.getInstance(ao2, ao3, ao4, fo0);
    double ld3 = 198.5009335599036;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld3, fd0, fd1, ld0);
}

Thought.STACK_COUNTER++;
return ao2;
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
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    Thought lo0 = Thought25.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought163.getInstance(ad2, ad3, ad4, fd0);
    Thought lo2 = Thought27.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
    Thought lo3 = Thought164.getInstance();
    fb0 = fb1 && fb0;
    fb1 = ad4 > fd0;
    Thought lo4 = Thought3.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fo0;
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
    Output.points[4][5] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
        Thought lo0 = Thought237.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[4][6] -= fd1;
        if (ab2) {
        ab3 = fd0 < fd1;
        ab4 = fd0 > fd1;
        boolean lb1 = true;
        double ld2 = 915.061783112743;
if(fo1 != null){
          fo1.m3();
}
}
Thought.STACK_COUNTER++;
return ao1;
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
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    Thought lo0 = Thought215.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    ad3 *= -1;
if(ao1 != null){
      ab2 = ao1.m2(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 < ad3;
    Thought lo1 = Thought315.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    Output.points[4][7] -= ad4;
    double ld2 = 518.0622497789649;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld3 = 613.3625513493566;
    boolean lb4 = false;
    fb0 = ad4 > fd0;
    double ld5 = 238.9565217970855;
    fd0 = fd1 + ld2;

Thought.STACK_COUNTER++;
return fo0;
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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[4][8] += fd1;
    Thought lo0 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3();
}
    fd0 *= -1;
    lb1 = !fb0;
    fb1 = fd1 < fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
        Thought lo3 = Thought336.getInstance(lb1, lb2, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fd1 < fd0;
    boolean lb4 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb5 = false;
        Thought lo6 = Thought261.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    lb2 = lb4 || lb5;

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
    fd0 *= -1;
    Thought lo0 = Thought201.getInstance();
    fd1 *= -1;
    Output.points[5][0] -= fd0;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    Output.points[5][1] -= fd0;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Output.points[5][2] += fd0;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought182.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][3] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    Thought lo3 = Thought388.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2();
}
    boolean lb4 = false;
    boolean lb5 = false;
    fd1 = fd0 + fd1;

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
