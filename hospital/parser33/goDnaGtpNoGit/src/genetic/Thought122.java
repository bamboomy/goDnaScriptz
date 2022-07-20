package genetic;
import java.util.ArrayList;
class Thought122 extends Thought{
private static ArrayList<Thought122> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 732.9594847632617;
private double fd1 = 985.2603237275263;
private Thought fo0 = null;
private Thought fo1 = null;
Thought122 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought122 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought122 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought122 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought122 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought122 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought122 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought122 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought122 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought122 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought122 instance = new Thought122 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        fb1 = fd1 > fd0;
        Thought lo0 = Thought350.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        fb1 = fd1 < fd0;
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
            fd1 *= -1;
            fd0 = fd1 - fd0;
            boolean lb1 = true;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
            boolean lb2 = false;
            Thought lo3 = Thought195.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    Thought lo0 = Thought105.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
        ab4 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    ab2 = fd0 > fd1;

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
    fb1 = ad1 > ad2;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld1 = 175.81111243155397;
    Thought lo2 = Thought283.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld1;
    Output.points[0][5] -= ad1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    if (fb1) {
        ad2 = ad3 + ad4;
        lb0 = fb0 && fb1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought387.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 && fb1;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    ab1 = !ab2;

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
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought296.getInstance();
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought346.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought288.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = !fb1;
        fb0 = !fb1;
    Output.points[0][6] -= fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;

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
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 210.21153925150594;
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Thought lo2 = Thought104.getInstance(fd1, ld0, ad1, ad2);
    fb1 = ad3 > ad4;
    Thought lo3 = Thought121.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
    lb1 = ad2 < ad3;
if(ao4 != null){
      fb0 = ao4.m2();
}
    ad4 *= -1;
    Output.points[0][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    double ld4 = 527.4865688149478;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld4, lb1, fb0, fb1, lb1);
}
    ad1 = ad2 + ad3;

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
    fd1 = fd0 - fd1;
    double ld0 = 666.5717347056412;
    double ld1 = 201.4101276678045;
if(ao1 != null){
      ab2 = ao1.m2(ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ld0 = ld1 - fd0;
    ab1 = !ab2;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ld0 > ld1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ab4 = fd0 < fd1;
            ld0 *= -1;
            Thought lo2 = Thought252.getInstance(ld1, fd0, fd1, ld0);
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
}
if(ao2 != null){
              fb0 = ao2.m2();
}
            ld1 *= -1;
            Output.points[0][8] += fd0;
            Output.points[1][0] -= fd1;
if(ao4 != null){
              ao3 = ao4.m4(fb1, ab1, ab2, ab3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought149.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    double ld1 = 137.88414299893458;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[1][1] += ad4;
    fb1 = ab1 && ab2;
    fd0 = fd1 - ld1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought28.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1);

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
    Thought lo0 = Thought104.getInstance();
    double ld1 = 602.4045040355887;
    ld1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    double ld3 = 784.0969900502756;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
}
    lb2 = ld3 > fd0;
    fd1 = ld1 - ld3;
    fd0 = fd1 + ld1;
    fb0 = fb1 || lb2;
    ld3 = fd0 + fd1;
    ld1 *= -1;
        fb0 = !fb1;
    boolean lb4 = false;
    double ld5 = 514.2599490425197;
    Output.points[1][2] += ld3;
if(fo1 != null){
      fo1.m3(ld5, fd0, fd1, ld1, lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld5, fd0, fd1);
}
    lb2 = ld1 < ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m2();
}
    ld3 = ld5 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb2);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld0 = 838.7073363461884;
    Thought lo1 = Thought228.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    lb2 = !ab1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    Output.points[1][3] -= fd1;
    ld0 = fd0 + fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 886.5269309002539;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld0 < ad1;
    Thought lo1 = Thought183.getInstance(fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;

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
    ab1 = ad1 < ad2;
    boolean lb0 = true;
    Thought lo1 = Thought175.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb2 = false;
    ad1 *= -1;
    Output.points[1][4] -= ad2;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    ab1 = ab2 || ab3;
    Output.points[1][5] -= ad3;
    ab4 = fb0 && fb1;
    boolean lb3 = true;
    lb0 = !lb2;
    lb3 = ab1 || ab2;
    double ld4 = 746.1290044636753;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = ad3 > ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = fd0 < fd1;
    Thought lo1 = Thought130.getInstance();
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought43.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
    double ld4 = 110.84471484380501;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld4, fd0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            fb1 = fd1 < ld4;
            Thought lo5 = Thought304.getInstance(ao4, fo0, fo1, ao1);
            fd0 *= -1;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    fb1 = !fb0;
    Thought lo0 = Thought377.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    if (fb0) {
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
        boolean lb2 = false;
        Output.points[1][6] += ad2;
if(ao4 != null){
          ao4.m1(ad3, ad4, fd0, fd1, lb2, lb1, fb0, fb1);
}
        boolean lb3 = true;
        lb2 = !lb3;
        lb1 = fb0 || fb1;
        ad1 = ad2 + ad3;
        double ld4 = 832.1834388964347;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, lb3, lb1, fb0);
}
        Thought lo5 = Thought32.getInstance(fo0, fo1, ao1, ao2);
        Output.points[1][7] -= ad3;
        ad4 *= -1;
        fb1 = !lb2;
        lb3 = fd0 < fd1;
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    lb3 = !ab1;
    Thought lo4 = Thought170.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    lb0 = lb1 && lb2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[1][8] += fd0;
    if (lb3) {
        fd1 = fd0 - fd1;
}
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
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, ab1, ab2);
}
    ad3 *= -1;
    double ld2 = 69.48760210964625;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab4 = !fb0;
    double ld3 = 150.68962572916342;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought364.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    double ld1 = 940.1663031589717;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld1 > fd0;
    fb1 = fd1 < ld1;
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    if (fb1) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        ld1 *= -1;
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        boolean lb2 = true;
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
    double ld0 = 305.9148139803414;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = ld0 > fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    fb0 = !fb1;
    Thought lo2 = Thought374.getInstance(fd1, ld0, fd0, fd1);
    lb1 = ld0 > fd0;
    Thought lo3 = Thought326.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    ab1 = ld0 > fd0;
    double ld4 = 265.5782962737551;
    Output.points[2][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4, lb1, ab1, ab2, ab3);
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
    double ld0 = 757.6222258997233;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 897.1823951369468;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
        Thought lo2 = Thought22.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
if(fo0 != null){
          fo0.m3();
}
        fb1 = fb0 || fb1;
        ld1 = ad1 + ad2;
        Thought lo3 = Thought257.getInstance(fb0, fb1, fb0, fb1);
        if (fb0) {
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        ab2 = !ab3;
        ab4 = !fb0;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fo0.m2(ab4, fb0, fb1, ab1);
}
        ab2 = ad2 < ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        fd1 = ad1 + ad2;
        double ld0 = 221.63727975213877;
        ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought210.getInstance(fd0, fd1, ld0, ad1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m2();
}
        double ld2 = 236.11262477825386;
        boolean lb3 = true;
        Output.points[2][1] -= fd0;
        ab3 = ab4 || fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought148.getInstance(lb0, fb0, fb1, lb0);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld2 = 781.7681636478148;
    ld2 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ld2;
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[2][2] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld2, fd0, fd1);
}
    fb0 = fb1 && lb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld0 = 904.6683401641541;
    Thought lo1 = Thought343.getInstance();
    fb0 = !fb1;
    double ld2 = 444.2658625235497;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ld2, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo0 = Thought285.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    double ld0 = 657.3839353142291;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    ab2 = ad3 < ad4;
    Thought lo1 = Thought165.getInstance(fd0, fd1, ld0, ad1);
    ad2 = ad3 - ad4;
    ab3 = ab4 && fb0;
    fb1 = !ab1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 635.6429852742282;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought213.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = ld0 < fd0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fd0 = fd1 - ld0;
    Output.points[2][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    fb1 = lb2 || fb0;
    double ld3 = 250.8393516900701;
    double ld4 = 794.6210804251748;
    fb1 = ld0 < ld3;
    ld4 = fd0 - fd1;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld3, ld4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[2][4] -= fd1;
    lb2 = ld0 > ld3;
    boolean lb5 = false;

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
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo0 = Thought398.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    fd1 *= -1;
    Thought lo1 = Thought394.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    fd1 *= -1;
    Output.points[2][5] += fd0;
    Thought lo3 = Thought157.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo0 != null){
      ad2 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 918.1535045751981;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fd1 = ld0 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld2 = 19.74931615145788;
    boolean lb3 = true;
    Output.points[2][6] -= fd0;

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
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = !ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        ab1 = !ab2;
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
        fb0 = fd0 > fd1;
    Output.points[2][7] -= fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[2][8] += fd1;
    fb1 = fd0 > fd1;
    Thought lo0 = Thought321.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m1(fd0, fd1, fd0, fd1);
}
    Output.points[3][0] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought361.getInstance();
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 398.1873699429412;
    double ld3 = 426.96553092718216;
    Thought lo4 = Thought7.getInstance(ao4, fo0, fo1, ao1, lb0, lb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ld2 *= -1;
    ld3 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
}
    ld3 = ad1 - ad2;
    lb0 = ad3 > ad4;
    Output.points[3][1] -= fd0;
if(ao3 != null){
      ao3.m1();
}
    lb1 = fd1 > ld2;
    ld3 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fd1 = ld2 + ld3;
    boolean lb5 = false;
    Thought lo6 = Thought83.getInstance(lb5, fb0, fb1, lb0);
    lb1 = !lb5;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        fd0 = fd1 - fd0;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[3][2] -= fd1;
        fd0 = fd1 - fd0;
        ab1 = ab2 && ab3;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        ab3 = ab4 || fb0;
        double ld0 = 140.1486611160112;
        fd0 = fd1 + ld0;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
        boolean lb1 = false;
        lb1 = !ab1;
        ab2 = !ab3;
        ab4 = ld0 < fd0;
        fd1 = ld0 + fd0;
if(ao3 != null){
          fd1 = ao3.m3();
}
        ld0 = fd0 + fd1;
        fb0 = ld0 > fd0;
        fd1 = ld0 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb1, ab1, ab2);
}
        fd1 = ld0 + fd0;
        ab3 = fd1 > ld0;
        fd0 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
        double ld2 = 290.94286040036246;
    lb0 = !lb1;
    double ld3 = 175.58716279851788;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, ld3, ad1, ad2, lb4, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    boolean lb5 = true;
    Thought lo6 = Thought127.getInstance(fd0, fd1, ld2, ld3, ab4, fb0, fb1, lb0);
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, lb1, lb4, lb5, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 224.24183797783868;
    Output.points[3][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = ld0 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    Output.points[3][4] -= ld0;
        fd0 = fd1 + ld0;

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
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Output.points[3][5] -= fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
    Output.points[3][6] -= fd0;
    boolean lb2 = true;
    lb1 = lb2 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    Output.points[3][7] += fd0;
    fb0 = fb1 || lb0;
    lb1 = fd1 < fd0;
    boolean lb3 = true;
    lb2 = lb3 && fb0;
    fd1 = fd0 - fd1;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld0 = 152.4871574740657;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = !fb0;
    Thought lo2 = Thought41.getInstance(ld0, fd0, fd1, ld0);
    Thought lo3 = Thought180.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    fb1 = !lb1;
    fb0 = fd1 < ld0;
    Output.points[3][8] += fd0;
    fb1 = fd1 < ld0;
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb1 = !fb0;
        boolean lb4 = true;
    Output.points[4][0] -= fd0;
    fb0 = !fb1;
    Output.points[4][1] -= fd1;
if(fo0 != null){
      ld0 = fo0.m3(lb1, lb4, fb0, fb1);
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
}
